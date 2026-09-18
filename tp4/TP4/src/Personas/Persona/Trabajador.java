package Persona;

import Ingreso.Ingreso;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
    private List<Ingreso> ingresosAnualesPersibidos;

    public void agregarIngreso(Ingreso ingresoAAgregar){
        this.ingresosAnualesPersibidos.add(ingresoAAgregar);
    }

    public double getTotalImponible(){
        return ingresosAnualesPersibidos.stream()
                        .mapToDouble(ingreso -> ingreso.getMontoImponible())
                        .sum();
    }

    public double getTotalPercibido(){
        return ingresosAnualesPersibidos.stream()
                .mapToDouble(ingreso -> ingreso.getMontoPercibido())
                .sum();
    }

    public double getImpuestoAPagar() {
        return this.getTotalImponible() * 0.02;
    }
}
