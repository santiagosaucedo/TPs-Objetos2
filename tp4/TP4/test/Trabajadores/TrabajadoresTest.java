package Trabajadores;


import Ingreso.Ingreso;
import Ingreso.IngresoPorHoraExtra;
import Persona.Trabajador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrabajadoresTest {
    private Trabajador Santiago;
    private Ingreso pesos;
    private IngresoPorHoraExtra pesosExtra;

    @BeforeEach
    public void setUP(){
        pesos = new Ingreso("pesosRandomPorTrabajar", 300 ,9);
        pesosExtra = new IngresoPorHoraExtra(9 , "plata gratis por trabajar mas", 200, 3 );
        Santiago = new Trabajador();
        Santiago.agregarIngreso(pesos);
        Santiago.agregarIngreso(pesosExtra);
    }

    @Test
    public void testTodo(){
        assertEquals(500, Santiago.getTotalPercibido());
        assertEquals(500, Santiago.getTotalImponible());
        assertEquals(60.0, Santiago.getImpuestoAPagar());
    }

}
