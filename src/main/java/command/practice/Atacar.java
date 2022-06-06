package command.practice;

public class Atacar implements ICommand{
    private Juego juego;

    public Atacar(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void execute() {
        juego.accion();
    }
}
