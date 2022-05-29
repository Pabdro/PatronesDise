package resolucionExamenFilaB.ej4;

public abstract class BuilderContrato {
    protected Contrato contrato;

    public Contrato getContrato(){
        return contrato;
    }

    public void createContrato(){
        this.contrato = new Contrato();
    }
    public abstract void buildCosto();
    public abstract void buildEmpresa();
    public abstract void buildListaDeCanales();
}
