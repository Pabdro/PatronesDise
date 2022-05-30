package resolucionExamenFilaB.ej1;

public class TemaDeTesis {
    private String titulo;
    private String mencion;
    private Estudiante datosDelEstudiante;
    public TemaDeTesis(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMencion() {
        return mencion;
    }

    public void setMencion(String mencion) {
        this.mencion = mencion;
    }

    public Estudiante getDatosDelEstudiante() {
        return datosDelEstudiante;
    }

    public void setDatosDelEstudiante(Estudiante datosDelEstudiante) {
        this.datosDelEstudiante = datosDelEstudiante;
    }
}
