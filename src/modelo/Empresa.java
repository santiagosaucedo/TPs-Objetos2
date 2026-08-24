package modelo;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados;
	private List<Recibo> recibosEmitidos;
	
	public Empresa(String nombre , String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = new ArrayList<>();
		this.recibosEmitidos = new ArrayList<>();
	}
	
	public String getCuit() {
		return this.cuit;
	}
	
	public void contratarEmpleado(Empleado empleado) {
	    if (!yaEstaContratado(empleado)) {
	        this.empleados.add(empleado);
	    }
	}
	
	public void despedirEmpleado(Empleado empleado) {
		if (yaEstaContratado(empleado)) {
			this.empleados.remove(empleado);
		}
	}
	
	private boolean yaEstaContratado(Empleado empleado) {
		return this.empleados.contains(empleado);
	}
	
	public List<Recibo> getRecibos(){
		return this.recibosEmitidos;
	}
	
	public List<Empleado> getEmpleados(){
		return this.empleados;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double brutosTotales() {
		return this.empleados.stream().mapToDouble(empleado -> empleado.bruto()).sum();
	}
	
	public double netosTotales() {
		return this.empleados.stream().mapToDouble(empleado -> empleado.neto()).sum();
		
	}
	
	public double retencionesTotales() {
		return this.empleados.stream().mapToDouble(empleado -> empleado.retenciones()).sum();
		
	}
	
	public void liquidarSueldos() {
		this.recibosEmitidos = this.empleados.stream()
				.map(empleado -> new Recibo(
						empleado.getNombre(), 
						empleado.getDireccion(), 
						new Date(), 
						empleado.bruto(), 
						empleado.neto(), 
						empleado.conceptos()
				)).toList();
	}

}
