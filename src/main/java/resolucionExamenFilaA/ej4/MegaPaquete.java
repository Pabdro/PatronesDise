package resolucionExamenFilaA.ej4;

public class MegaPaquete extends BuilderPaquete{

    @Override
    public void buildPipocas() {
        this.paquete.setPipocas("extragrandes");
    }

    @Override
    public void buildRefresco() {
this.paquete.setRefrescos("3 vasos de refresco grandes");
    }

    @Override
    public void buildChocolate() {
this.paquete.setChocolates("2 chocolates grandes");
    }
}
