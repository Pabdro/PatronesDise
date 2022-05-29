package resolucionExamenFilaA.ej3;

public class Television implements IArtefacto{
    private int precio= 100;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("Informacion de la television");
        System.out.println("precio: "+precio);
        System.out.println();
    }
}
