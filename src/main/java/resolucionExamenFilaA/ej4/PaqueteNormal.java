package resolucionExamenFilaA.ej4;

public class PaqueteNormal extends BuilderPaquete{

    @Override
    public void buildPipocas() {
        this.paquete.setPipocas("normales");
    }

    @Override
    public void buildRefresco() {
        this.paquete.setRefrescos("1 refresco");

    }

    @Override
    public void buildChocolate() {
        this.paquete.setChocolates("0");

    }
}
