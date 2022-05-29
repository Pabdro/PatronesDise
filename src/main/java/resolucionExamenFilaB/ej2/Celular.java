package resolucionExamenFilaB.ej2;

public class Celular implements ICelular{
    private String modelo;
    private int tamano;
    private int peso;
    private Camara camara;
    private int imei;
    private String paisCreado;
    public Celular(){}
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getPaisCreado() {
        return paisCreado;
    }

    public void setPaisCreado(String paisCreado) {
        this.paisCreado = paisCreado;
    }

    @Override
    public Object clone() {
        Celular clone = new Celular();
        Camara camara = new Camara();
        camara.setFoco(this.getCamara().getFoco());
        camara.setLente(this.getCamara().getLente());
        clone.setModelo(this.getModelo());
        clone.setTamano(this.getTamano());
        clone.setPeso(this.getPeso());
        clone.setCamara(camara);
        clone.setPaisCreado(this.getPaisCreado());
        return clone;
    }
    public void showInfo() {
        System.out.println("modelo="+getModelo());
        System.out.println("tamano="+getTamano());
        System.out.println("peso="+getPeso());
        System.out.println("foco de la camara="+getCamara().getFoco());
        System.out.println("Camara lente="+getCamara().getLente());
        System.out.println("imei="+getImei());
        System.out.println("pais creado="+getPaisCreado());
        System.out.println();
    }
}
