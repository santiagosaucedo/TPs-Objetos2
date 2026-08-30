package PersonaPaquete;

import java.util.Calendar;
import java.util.Date;

public class Persona {
    private String nombre;
    private Date fechaNacimiento;



    public Persona(String nombre , Date fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean menorQue(Persona personaAEvaluar ){return this.edad() < personaAEvaluar.edad();}

    public int edad() {
        int aniosBase = this.calcularDiferenciaAnios();
        if (this.todaviaNoCumplioAnios()) {
            --aniosBase;
        }

        return aniosBase;
    }
    private int calcularDiferenciaAnios() {return this.getAnioActual() - this.getAnioNacimiento();}
    private boolean todaviaNoCumplioAnios() {return this.getDiaDelAnioActual() < this.getDiaDelAnioNacimiento();}
    private int getAnioActual() {return this.getCalendarioHoy().get(1);}
    private int getAnioNacimiento() {return this.getCalendarioNacimiento().get(1);}
    private int getDiaDelAnioActual() {return this.getCalendarioHoy().get(6);}
    private int getDiaDelAnioNacimiento() {return this.getCalendarioNacimiento().get(6);}
    private Calendar getCalendarioHoy() {return Calendar.getInstance();}
    private Calendar getCalendarioNacimiento() {
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(this.fechaNacimiento);
        return nacimiento;
    }
}
