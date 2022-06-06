package command.practice;

public class Juego {
    private String accion;
    public Juego(){}

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
    public void accion(){
        System.out.println("iniciando la accion: "+accion);
    }
}
