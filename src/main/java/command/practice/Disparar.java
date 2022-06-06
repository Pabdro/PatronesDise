package command.practice;

public class Disparar implements ICommand{
    private Juego juego;

    public Disparar(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void execute() {
        juego.accion();
    }
}
