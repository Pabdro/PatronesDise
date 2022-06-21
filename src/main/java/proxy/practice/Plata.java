package proxy.practice;

public class Plata {
    private int plata;
    private String moneda;

    public Plata(int plata, String moneda) {
        this.plata = plata;
        this.moneda = moneda;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    public void showInfo(){
        System.out.println("retiro: "+plata);
        System.out.println("moneda: "+moneda);
    }

}
