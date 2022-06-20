package adapter.practice;

public class Lavadoras implements IArtefactosE{
    private int precio;
    private int tiempoDeGarantia;

    public Lavadoras(int precio, int tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("precio lavadora " + precio);
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("garatia lavadora " + tiempoDeGarantia);
    }

}
