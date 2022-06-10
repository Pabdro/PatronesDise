package strategy.practice;

public class Client {
    public static void main(String[] args) {
        TiendaRopa tiendaRopa=new TiendaRopa();
        tiendaRopa.addRopa(new Ropa(20, "chamarra"));

        tiendaRopa.setEstrategia(new Invierno());
        tiendaRopa.iniciarEstrategia();
        tiendaRopa.setEstrategia(new Verano());
        tiendaRopa.iniciarEstrategia();
        tiendaRopa.setEstrategia(new Primavera());
        tiendaRopa.iniciarEstrategia();
        tiendaRopa.setEstrategia(new Otonio());
        tiendaRopa.iniciarEstrategia();
    }
}
