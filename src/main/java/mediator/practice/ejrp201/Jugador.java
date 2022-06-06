package mediator.practice.ejrp201;

public abstract class Jugador {
    protected ICanal canal;
    private String nombre;
    private String rate;

    public Jugador(ICanal canal) {
        this.canal = canal;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract void send(String msg);
    public abstract void received(String msg);
}
