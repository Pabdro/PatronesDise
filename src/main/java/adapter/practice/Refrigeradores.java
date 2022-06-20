package adapter.practice;

public class Refrigeradores implements IArtefactosE{
    private int precio;
    private int tiempoDeGarantia;

    public Refrigeradores(int precio, int tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("precio refrigerador " + precio);
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("garantia refrigerador " + tiempoDeGarantia);
    }

}
