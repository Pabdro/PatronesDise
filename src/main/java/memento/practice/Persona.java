package memento.practice;

public class Persona {
    private String name;
    private int ci;
    private String edad;
    public Persona(String name, int ci, String edad){
        this.name=name;
        this.ci=ci;
        this.edad=edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    public void showInfo(){
        System.out.println("name: "+name);
        System.out.println("ci: "+ci);
        System.out.println("edad: "+edad);
    }
}
