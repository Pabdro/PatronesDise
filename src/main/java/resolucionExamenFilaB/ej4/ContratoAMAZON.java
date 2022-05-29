package resolucionExamenFilaB.ej4;

public class ContratoAMAZON extends BuilderContrato{
    @Override
    public void buildCosto() {
        this.contrato.setCosto("50 bs");
    }

    @Override
    public void buildEmpresa() {
        this.contrato.setEmpresa("aws");
    }

    @Override
    public void buildListaDeCanales() {
        this.contrato.setListaDeCanales("Entrenando a tu dragon, Masacre, El lorax");
    }
}
