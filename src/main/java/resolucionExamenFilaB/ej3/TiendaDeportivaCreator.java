package resolucionExamenFilaB.ej3;

public class TiendaDeportivaCreator extends Creator{
    @Override
    public IElementos createElementos() {
        PelotaFutbol pf = new PelotaFutbol();
        pf.setTamano("normal");
        pf.setColor("amarillo");
        pf.setGarantia("una decada");
        TiendaDeportiva elementos = new TiendaDeportiva();
        elementos.setPelota(pf);
        elementos.setCamiseta("Tigre");
        elementos.setShorts("Shorts rojos");
        elementos.setMedias("Medias blancas");
        elementos.setTenis("Cachos negros");
        return elementos;
    }
}
