package memento.practice;

import java.util.List;

public class BaseDeDatos {
    private List<Persona> personas;

    public BaseDeDatos(List<Persona> personas) {

        this.personas = personas;
    }

    public List<Persona> getPersonas() {

        return personas;
    }

    public void setPersonas(List<Persona> personas) {

        this.personas = personas;
    }
    public void showInfo(){
        System.out.println("info base de datos");
        for (int i = 0; i<personas.size();i++){
            personas.get(i).showInfo();
        }
    }
}
