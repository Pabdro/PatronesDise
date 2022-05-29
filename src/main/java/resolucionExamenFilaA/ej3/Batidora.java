package resolucionExamenFilaA.ej3;

public class Batidora implements IArtefacto{
    private int precio=75453;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("Informacion de la batidora");
        System.out.println("precio: "+precio);
        System.out.println();
    }
}
