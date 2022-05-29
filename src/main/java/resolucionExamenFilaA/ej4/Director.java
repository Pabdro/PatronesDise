package resolucionExamenFilaA.ej4;

public class Director {
    private BuilderPaquete builder;

    public Paquete getPaquete() {
        return builder.getPaquete();
    }

    public void setBuilder(BuilderPaquete builder) {
        this.builder = builder;
    }
    public void buildPaquete(){
        this.builder.createPaquete();
        this.builder.buildPipocas();
        this.builder.buildRefresco();
        this.builder.buildChocolate();
    }
}
