package resolucionExamenFilaA.ej3;

public class FactoryArtefacto {
    public static IArtefacto make(TipoArtefacto type){
        IArtefacto artefacto;
        switch (type){
            case TELEVISION:
                artefacto = new Television();
                break;
            case RADIO:
                artefacto = new Radio();
                break;
            case BATIDORA:
                artefacto = new Batidora();
                break;
            case REFRIGERADOR:
                artefacto = new Refrigerador();
                break;
            case MICROONDAS:
                artefacto = new Microondas();
                break;
            default:
                artefacto = new Television();
                break;
        }
        return artefacto;
    }
}
