package resolucionExamenFilaB.ej4;

public class ContratoHBO extends BuilderContrato{
    @Override
    public void buildCosto() {
        this.contrato.setCosto("100 bs");
    }

    @Override
    public void buildEmpresa() {
        this.contrato.setEmpresa("hbo");
    }

    @Override
    public void buildListaDeCanales() {
        this.contrato.setListaDeCanales("Cars, Inmorta, Soy Leyenda");
    }
}
