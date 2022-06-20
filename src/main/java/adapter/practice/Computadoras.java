package adapter.practice;

public class Computadoras implements IArtefactos{
    private int precio;
    private int tiempoDeVida;

    public Computadoras(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("precio computadora " + precio);
    }

    @Override
    public void showTiempo() {
        System.out.println("tiempo de vida de la computadora " + tiempoDeVida);
    }
}
