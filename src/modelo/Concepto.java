package modelo;

public class Concepto {
    private String descripcion;
    private double monto;
    
    public Concepto(String descripcion, double monto) {
        this.descripcion = descripcion;
        this.monto = monto;
    }
    
    public String getDescripcion() {
    	return this.descripcion;
    }
    
    public double getMonto() {
    	return this.monto;
    }
}
