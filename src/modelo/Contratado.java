package modelo;

import java.util.Date;
import java.util.List;

public class Contratado extends Empleado{
	private int numeroDeContrato;
	private String medioDePago;
	
	public Contratado(String nombre, String direccion, boolean estadoCivil, Date fechaDeNacimiento, double sueldoBasico, int numeroDeContrato, String medioDePago) {
        super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
        this.numeroDeContrato = numeroDeContrato;
        this.medioDePago = medioDePago;
    }
	
	public double bruto() {
        return super.getSueldoBasico(); 
    }
	
    public double retenciones() {
        return gastosAdministrativos();
    }
	
	private double gastosAdministrativos(){
        return 50.0;
    }
	
	public int getNumeroDeContrato() {
		return this.numeroDeContrato;
	}
	
	public String getMedioDePago() {
		return this.medioDePago;
	}
	
	public List<Concepto> conceptos(){
        List<Concepto> detalle = super.conceptos(); 
        
        detalle.add(new Concepto("Gastos Administrativos Contractuales", -this.gastosAdministrativos()));
        
        return detalle;
    }

}
