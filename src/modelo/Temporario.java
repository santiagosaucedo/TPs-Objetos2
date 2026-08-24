package modelo;

import java.util.Date;
import java.util.List;

public class Temporario extends Empleado {
    private Date fechaFin;
    private int horasExtra;
    
    public Temporario (String nombre, String direccion, boolean estadoCivil, Date fechaDeNacimiento, double sueldoBasico, Date fechaFin, int horasExtra){
    	super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
    	this.fechaFin = fechaFin;
    	this.horasExtra = horasExtra;
    }
    
    public Date geteFechaFin() {
    	return this.fechaFin;
    }
    public double bruto(){
     	return super.getSueldoBasico() + this.cantidadPorHorasExtra() ;
 	}
    
    private int getHorasExtra(){
    	return this.horasExtra;
    }
    
    private double cantidadPorHorasExtra(){
    	double cantidadPorHora = 40.0;
    	return this.getHorasExtra() * cantidadPorHora;
    }
    
    private double adicionalPorEdad(){
    	return (this.edad() > 50) ? 25.0 : 0.0;
    }
    
    private double aportesJubilatorios() {
        double porcentaje = 0.10;
        double valorRetencionPorHora = 5.0;
        return (this.bruto() * porcentaje) + (this.getHorasExtra() * valorRetencionPorHora);
    }
    
    private double obraSocial() {
        double porcentaje = 0.10;
        return (this.bruto() * porcentaje) + adicionalPorEdad();
    }
    
    public double retenciones() {
        return obraSocial() + aportesJubilatorios();
    }
 	
 	
     public List<Concepto> conceptos(){
    	 List<Concepto> detalle = super.conceptos();
    	 
    	 if (this.horasExtra > 0) {
             detalle.add(new Concepto("Horas Extras", this.cantidadPorHorasExtra()));
         }
    	 detalle.add(new Concepto("Obra Social", -this.obraSocial()));
         detalle.add(new Concepto("Aportes Jubilatorios", -this.aportesJubilatorios()));
         
         return detalle;
 	}
}
