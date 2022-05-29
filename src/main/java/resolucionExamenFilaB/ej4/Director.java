package resolucionExamenFilaB.ej4;

public class Director {
    private BuilderContrato builder;

    public Contrato getContratotBuilder(){
        return builder.getContrato();
    }

    public void setBuilder(BuilderContrato builder) {
        this.builder = builder;
    }
    public void buildProduct(){
        this.builder.createContrato();
        this.builder.buildCosto();
        this.builder.buildEmpresa();
        this.builder.buildListaDeCanales();
    }
}
