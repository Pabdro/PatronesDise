package resolucionExamenFilaA.ej4;

public abstract class BuilderPaquete {
    protected Paquete paquete;

    public Paquete getPaquete() {
        return paquete;
    }

    public void createPaquete() {
        this.paquete = new Paquete();
    }

    public abstract void buildPipocas();
    public abstract void buildRefresco();
    public abstract void buildChocolate();
}
