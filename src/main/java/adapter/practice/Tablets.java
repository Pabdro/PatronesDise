package adapter.practice;

public class Tablets implements IArtefactos{
    private int precio;
    private int tiempoDeVida;

    public Tablets(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("precio tablet " + precio);
    }

    @Override
    public void showTiempo() {
        System.out.println("tiempo de vida de la tablet " + tiempoDeVida);
    }
}
