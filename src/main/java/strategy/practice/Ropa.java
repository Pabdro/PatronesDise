package strategy.practice;

public class Ropa {
    int precio;
    int precioEstrategia;
    String tipo;
    public Ropa(int precio, String tipo) {
        this.precio = precio;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecioEstrategia() {
        return precioEstrategia;
    }

    public void setPrecioEstrategia(int precioEstrategia) {
        this.precioEstrategia = precioEstrategia;
    }
    public void info(){
        System.out.println("tipo: "+tipo);
        System.out.println("precio "+precio+" Bs");
        System.out.println("precio temporada: "+precioEstrategia+" Bs");
        System.out.println();
    }
}
