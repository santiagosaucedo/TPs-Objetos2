package Ingreso;

public class IngresoPorHoraExtra extends Ingreso {
    private int cantidadHorasExtras;

    public IngresoPorHoraExtra(int mes, String concepto, double montoPercibido, int cantidadHorasExtras) {
        super(concepto, montoPercibido,mes);
        this.cantidadHorasExtras = cantidadHorasExtras;
    }

    @Override
    public double getMontoImponible(){
        return 0.0;
    }
}
