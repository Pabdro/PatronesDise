package mediator.practice.ejrp201;

public class Equipo extends Jugador{
    private String catalizador;

    public String getCatalizador() {
        return catalizador;
    }

    public void setCatalizador(String catalizador) {
        this.catalizador = catalizador;
    }

    public Equipo(ICanal canal) {
        super(canal);
    }

    @Override
    public void send(String msg) {
        canal.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Nombre: " + getNombre() + ", Rate: " + getRate() + ", Tipo: " + catalizador);
        System.out.println("Mensaje recibido: " + msg);
    }
}
