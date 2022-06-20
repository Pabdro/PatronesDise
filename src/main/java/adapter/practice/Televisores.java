package adapter.practice;

public class Televisores implements IArtefactosE{
    private int precio;
    private int tiempoDeGarantia;

    public Televisores(int precio, int tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("precio televisor " +precio);
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("garantia del televisor " + tiempoDeGarantia);
    }

}
