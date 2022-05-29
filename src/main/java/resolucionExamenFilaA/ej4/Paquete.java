package resolucionExamenFilaA.ej4;

public class Paquete {
    private String pipocas;
    private String refrescos;
    private String chocolates;
    public Paquete(){}

    public String getPipocas() {
        return pipocas;
    }

    public void setPipocas(String pipocas) {
        this.pipocas = pipocas;
    }

    public String getRefrescos() {
        return refrescos;
    }

    public void setRefrescos(String refrescos) {
        this.refrescos = refrescos;
    }

    public String getChocolates() {
        return chocolates;
    }

    public void setChocolates(String chocolates) {
        this.chocolates = chocolates;
    }

    public void showInfo() {
        System.out.println("pipocas: "+pipocas);
        System.out.println("refresco: "+refrescos);
        System.out.println("chocolate: "+chocolates);
    }
}
