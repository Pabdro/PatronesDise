package resolucionExamenFilaB.ej4;

public class ContratoNETFLIX extends BuilderContrato{
    @Override
    public void buildCosto() {
        this.contrato.setCosto("150 bs");
    }

    @Override
    public void buildEmpresa() {
        this.contrato.setEmpresa("netflix");
    }

    @Override
    public void buildListaDeCanales() {
        this.contrato.setListaDeCanales("La era del hielo, Volver al futuro, Titanic");
    }
}
