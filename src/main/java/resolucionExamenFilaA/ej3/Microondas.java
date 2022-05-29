package resolucionExamenFilaA.ej3;

public class Microondas implements IArtefacto{
    private int precio=324;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("Informacion del microondas");
        System.out.println("precio: "+precio);
        System.out.println();
    }
}
