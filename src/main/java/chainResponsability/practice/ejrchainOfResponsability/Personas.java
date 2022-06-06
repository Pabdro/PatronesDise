package chainResponsability.practice.ejrchainOfResponsability;

public class Personas {
    private int ci;
    private String nombre;
    private int edad;

    public Personas(int ci, String nombre, int edad) {
        this.ci = ci;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
