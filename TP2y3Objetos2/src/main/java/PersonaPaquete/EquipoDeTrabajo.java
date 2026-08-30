package PersonaPaquete;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
    private List<Persona> personasDelEquipo;

    public EquipoDeTrabajo() {
        this.personasDelEquipo = new ArrayList<>();
    }

    public int promedioDeEdades(){
        return (int) this.personasDelEquipo.stream()
                .mapToInt(Persona::edad)
                .average()
                .orElse(0);
    }

    public void agregarPersonaAlEquipo(Persona personaAAgregar){
        this.personasDelEquipo.add(personaAAgregar);
    }
    public List<Persona> getPersonasDelEquipo() {return personasDelEquipo;}
}
