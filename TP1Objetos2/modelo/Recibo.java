package modelo;

import java.util.Date;
import java.util.List;

public class Recibo {
	private String nombreEmpleado;
	private String direccionEmpleado;
	private Date fechaRecibo;
	private double brutoDelEmpleado;
	private double netoDelEmpleado;
	private List<Concepto> conceptos;
	
	public Recibo(String nombre, String direccion, Date fecha, double bruto, double neto, List<Concepto> conceptos) {
        this.nombreEmpleado = nombre;
        this.direccionEmpleado = direccion;
        this.fechaRecibo = fecha;
        this.brutoDelEmpleado = bruto;
        this.netoDelEmpleado = neto;
        this.conceptos = conceptos;
    }
	
	public String getNombreDelEmpleado() {
		return this.nombreEmpleado;
	}
	
	public String getDireccionEmpleado() {
		return this.direccionEmpleado;
	}
	
	public Date getFechaRecibo() {
		return this.fechaRecibo;
	}
	
	public double getBrutoDelEmpleado() {
		return this.brutoDelEmpleado;
	}
	
	public double getNetoDelEmpleado() {
		return this.netoDelEmpleado;
	}
	
	public List<Concepto> getConceptosDelEmpleado(){
		return this.conceptos;
	}
	

}
