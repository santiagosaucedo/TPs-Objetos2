package modelo;

import java.util.Date;
import java.util.List;

public class Permanente extends Empleado {
     private int cantidadHijos;
     private int antiguedad;
     
     public Permanente(String nombre, String direccion, boolean estadoCivil, Date fechaDeNacimiento, double sueldoBasico,int antiguedad ,  int cantidadHijos) {
         super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
         this.cantidadHijos = cantidadHijos;
         this.antiguedad = antiguedad;
     }
     
    public double bruto(){
     	return super.getSueldoBasico() + this.salarioFamiliar();
 	}
    
    private double salarioFamiliar() {
    	return asignacionPorHijo() + asignacionPorConyuge() + adicionalPorAntiguedad();
    }
    
    private double asignacionPorHijo() {
    	double cantAsignacion = 150.0;
		return this.cantHijos() * cantAsignacion;
	}
	
	private double asignacionPorConyuge() {
		double cantPorConyuge = 100.0;
		if (super.estaCasado()) {
			return cantPorConyuge;
		}
		return 0.0;
	}
	
	private int cantHijos() {
		return this.cantidadHijos;
	}
	
	private double adicionalPorAntiguedad() {
		double cantPorAntiguedad = 50.0;
		return this.antiguedad * cantPorAntiguedad;
	}
 	
	private double obraSocial() {
		double porcentajePorHijo = 0.10;
		double multiplicadorPorHijo = 20.0;
		return ((this.bruto() * porcentajePorHijo) + (this.cantHijos() * multiplicadorPorHijo));
	}
	private double aportesJubilatorios() {
		double porcentajePorAportes = 0.15; 
		return this.bruto() * porcentajePorAportes;
	}
	
	
 	public double retenciones(){
 		return this.aportesJubilatorios() + this.obraSocial();
 	}
 	
 	public List<Concepto> conceptos(){
		List<Concepto> detalle = super.conceptos();
		if (this.cantHijos() > 0) {
			detalle.add(new Concepto("Asignación por Hijo", this.asignacionPorHijo()));
		}
		if (super.estaCasado()) {
			detalle.add(new Concepto("Asignación por Cónyuge", this.asignacionPorConyuge()));
		}
		if (this.antiguedad > 0) {
			detalle.add(new Concepto("Antigüedad", this.adicionalPorAntiguedad()));
		}
		
		detalle.add(new Concepto("Obra Social", -this.obraSocial()));
		detalle.add(new Concepto("Aportes Jubilatorios", -this.aportesJubilatorios()));
		return detalle;
	}
}
