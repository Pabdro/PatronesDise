package memento.practice;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Caretakerbdd bdd=new Caretakerbdd();
        Originator originator=new Originator();
        BaseDeDatos persona;
        List<Persona> personas1= new ArrayList<>();
        personas1.add(new Persona("Marcos", 1111111, "20 años"));
        personas1.add(new Persona("Jomy", 222222, "19 años"));
        persona=new BaseDeDatos(personas1);

        List<Persona> personas2= new ArrayList<>();
        personas2.add(new Persona("Gabriel", 342124, "20 años"));
        personas2.add(new Persona("Cami", 54325, "19 años"));
        personas2.add(new Persona("Andres", 2345234, "19 años"));
        personas2.add(new Persona("Alejandro", 5436, "19 años"));
        personas2.add(new Persona("Anthony", 234412, "19 años"));
        persona=new BaseDeDatos(personas2);
        originator.setMemento(persona);
        bdd.addMemento("BackupEnero", originator.createMemento());

        List<Persona> personas3= new ArrayList<>();
        personas3.add(new Persona("Richard", 5463534, "20 años"));
        personas3.add(new Persona("Miguel", 34254235, "19 años"));
        personas3.add(new Persona("Luis", 12341423, "19 años"));
        personas3.add(new Persona("Cris", 67676856, "19 años"));
        persona=new BaseDeDatos(personas3);

        List<Persona> personas4= new ArrayList<>();
        personas4.add(new Persona("Ariane", 97896896, "20 años"));
        personas4.add(new Persona("Dylan", 5676754, "19 años"));
        personas4.add(new Persona("Felipe", 34255345, "19 años"));
        persona=new BaseDeDatos(personas4);

        List<Persona> personas5= new ArrayList<>();
        personas5.add(new Persona("Xime", 5436364, "20 años"));
        persona=new BaseDeDatos(personas5);

        persona.showInfo();
        System.out.println("********");
        persona=originator.restoreMemento(bdd.getMemento("BackupEnero"));
        persona.showInfo();
    }
}
