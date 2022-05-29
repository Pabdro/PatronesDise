package resolucionExamenFilaB.ej3;

public class Client {
    public static void main(String[] args) {
        TiendaDeportiva tp= (TiendaDeportiva) new TiendaDeportivaCreator().createElementos();
        tp.showInfo();
    }
}
