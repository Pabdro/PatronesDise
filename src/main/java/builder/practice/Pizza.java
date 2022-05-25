package builder.practice;

public class Pizza {
    private String nombre;
    private String ingredientes;
    private String tipoMasa;
    private String tipoQueso;

    public Pizza(){}

    public String getNombre() {
        return nombre;
    }

    public Pizza setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public Pizza setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public Pizza setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
        return this;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public Pizza setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public void showInfo() {
        System.out.println("* "+nombre);
        System.out.println("ingredientes= "+ingredientes);
        System.out.println("tipo de massa= "+tipoMasa);
        System.out.println("tipo de queso= "+tipoQueso);
        System.out.println();
    }
}
