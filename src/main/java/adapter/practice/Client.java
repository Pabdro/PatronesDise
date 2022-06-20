package adapter.practice;

public class Client {
    public static void main(String[] args) {
        IArtefactos celular = new Celulares(1000, 6);
        celular.showPrecio();
        celular.showTiempo();

        IArtefactos tablet = new Tablets(2500, 6);
        tablet.showPrecio();
        tablet.showTiempo();

        IArtefactos computadora = new Computadoras(8000, 8);
        computadora.showPrecio();
        computadora.showTiempo();

        IArtefactos televisor = new AdaptadorArtefactos(new Televisores(1200, 4));
        televisor.showPrecio();
        televisor.showTiempo();

        IArtefactos lavadora = new AdaptadorArtefactos(new Lavadoras(300, 1));
        lavadora.showPrecio();
        lavadora.showTiempo();

        IArtefactos refrigerador = new AdaptadorArtefactos(new Refrigeradores(8000, 3));
        refrigerador.showPrecio();
        refrigerador.showTiempo();
    }
}
