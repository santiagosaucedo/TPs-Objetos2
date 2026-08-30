package modelo;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public abstract class Empleado {
	private Date fechaDeNacimiento;
	private String nombre;
	private String direccion;
	private boolean estadoCivil;
	private double sueldoBasico;
	public abstract double retenciones();
	public abstract double bruto();
	
	public void esCasado() {
		this.estadoCivil = true;
	}
	
	
	public boolean estaCasado() {
		return this.estadoCivil;
	}
	
	public void noEsCasado() {
		this.estadoCivil = false;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Empleado(String nombre, String direccion, boolean estadoCivil, Date fechaDeNacimiento, double sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public double getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public int edad(){
		int añosBase = calcularDiferenciaAnios();
		if (todaviaNoCumplioAnios()) {
			añosBase--;
		}
		return añosBase;
		
	}
	
	private int calcularDiferenciaAnios() {
	    return getAnioActual() - getAnioNacimiento();
	}
	
	private boolean todaviaNoCumplioAnios() {
		return getDiaDelAnioActual() < getDiaDelAnioNacimiento();
	}
	
	private int getAnioActual() {
		return getCalendarioHoy().get(Calendar.YEAR);
	}

	private int getAnioNacimiento() {
		return getCalendarioNacimiento().get(Calendar.YEAR);
	}

	private int getDiaDelAnioActual() {
		return getCalendarioHoy().get(Calendar.DAY_OF_YEAR);
	}

	private int getDiaDelAnioNacimiento() {
		return getCalendarioNacimiento().get(Calendar.DAY_OF_YEAR);
	}
	
	private Calendar getCalendarioHoy() {
		return Calendar.getInstance();
	}
	
	private Calendar getCalendarioNacimiento() {
		Calendar nacimiento = Calendar.getInstance();
		nacimiento.setTime(this.fechaDeNacimiento);
		return nacimiento;
	}
	
	public List<Concepto> conceptos() {
		List<Concepto> detalle = new ArrayList<>();
		detalle.add(new Concepto("Sueldo Básico", this.getSueldoBasico()));
		
		return detalle;
	}
	
	
	public double neto() {
	    return this.bruto() - this.retenciones();
	}
}
