package adapter.practice;

public class Celulares implements IArtefactos{
    private int precio;
    private int tiempoDeVida;

    public Celulares(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("precio celular " + precio);
    }

    @Override
    public void showTiempo() {
        System.out.println("tiempo de vida del celular " + tiempoDeVida);
    }
}
