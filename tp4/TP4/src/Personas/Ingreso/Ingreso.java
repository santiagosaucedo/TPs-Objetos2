package Ingreso;

public class Ingreso {
    private int mesPercepcion;
    private String concepto;
    private double montoPercibido;

    public Ingreso(String concepto, double montoPercibido , int mesPercepcion){
        this.concepto = concepto;
        this.montoPercibido = montoPercibido;
        this.mesPercepcion = mesPercepcion;
    }

    public double getMontoImponible(){
        return this.montoPercibido;
    }
    public double getMontoPercibido() {return this.montoPercibido;}

}
