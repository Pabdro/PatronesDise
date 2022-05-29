package resolucionExamenFilaB.ej3;

public class TiendaDeportiva implements  IElementos{
    private PelotaFutbol pelota;
    private String camiseta;
    private String shorts;
    private String medias;
    private String tenis;
    public TiendaDeportiva(){}

    public PelotaFutbol getPelota() {
        return pelota;
    }

    public void setPelota(PelotaFutbol pelota) {
        this.pelota = pelota;
    }

    public String getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(String camiseta) {
        this.camiseta = camiseta;
    }

    public String getShorts() {
        return shorts;
    }

    public void setShorts(String shorts) {
        this.shorts = shorts;
    }

    public String getMedias() {
        return medias;
    }

    public void setMedias(String medias) {
        this.medias = medias;
    }

    public String getTenis() {
        return tenis;
    }

    public void setTenis(String tenis) {
        this.tenis = tenis;
    }

    @Override
    public void showInfo() {
        System.out.println("Tienda deportiva");
        System.out.println("tamano de la pelota: "+pelota.getTamano());
        System.out.println("color de la pelota: "+pelota.getColor());
        System.out.println("garantia de la pelota: "+pelota.getGarantia());
        System.out.println("Camiseta:"+camiseta);
        System.out.println("Shorts: "+shorts);
        System.out.println("Medias: "+medias);
        System.out.println("Tenis: "+tenis);
        System.out.println();
    }
}
