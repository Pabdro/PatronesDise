package resolucionExamenFilaA.ej3;

public class Refrigerador implements IArtefacto{
    private int precio=20;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("Informacion del refrigerador");
        System.out.println("precio: "+precio);
        System.out.println();
    }
}
