package unq;

import PersonaPaquete.EquipoDeTrabajo;
import PersonaPaquete.Persona;
import org.junit.jupiter.api.Test;


import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquipoDeTrabajoTest {

    @Test
    public void testPromedioDeEdad() {
        EquipoDeTrabajo equipo = new EquipoDeTrabajo();

        equipo.agregarPersonaAlEquipo(new Persona("Ana", crearFecha(1995, 5, 20)));
        equipo.agregarPersonaAlEquipo(new Persona("Luis", crearFecha(1985, 10, 15)));
        equipo.agregarPersonaAlEquipo(new Persona("Carlos", crearFecha(2000, 1, 10)));
        equipo.agregarPersonaAlEquipo(new Persona("Marta", crearFecha(1992, 8, 5)));
        equipo.agregarPersonaAlEquipo(new Persona("Sofia", crearFecha(1998, 12, 30)));
        int promedio = equipo.promedioDeEdades();
        assertEquals(31, promedio);
    }
    private Date crearFecha(int anio, int mes, int dia) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(anio, mes - 1, dia);
        return calendario.getTime();
    }
}