package resolucionExamenFilaA.ej4;

public class PaqueteMediano extends BuilderPaquete{

    @Override
    public void buildPipocas() {
        this.paquete.setPipocas("grandes");
    }

    @Override
    public void buildRefresco() {
        this.paquete.setRefrescos("2 vasos de refresco");

    }

    @Override
    public void buildChocolate() {
        this.paquete.setChocolates("1 chocolate");

    }
}
