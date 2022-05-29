package resolucionExamenFilaA.ej3;

public class Client {
    public static void main(String[] args) {
        IArtefacto artefacto1= FactoryArtefacto.make(TipoArtefacto.TELEVISION);
        artefacto1.showInfo();

        IArtefacto artefacto2= FactoryArtefacto.make(TipoArtefacto.RADIO);
        artefacto2.showInfo();

        IArtefacto artefacto3= FactoryArtefacto.make(TipoArtefacto.BATIDORA);
        artefacto3.showInfo();

        IArtefacto artefacto4= FactoryArtefacto.make(TipoArtefacto.REFRIGERADOR);
        artefacto4.showInfo();

        IArtefacto artefacto5= FactoryArtefacto.make(TipoArtefacto.MICROONDAS);
        artefacto5.showInfo();

    }
}
