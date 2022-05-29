package resolucionExamenFilaA.ej3;

public class Radio implements IArtefacto{
    private int precio=467;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("Informacion de la radio");
        System.out.println("precio: "+precio);
        System.out.println();
    }
}
