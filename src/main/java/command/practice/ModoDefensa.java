package command.practice;

public class ModoDefensa implements ICommand{
    private Juego juego;

    public ModoDefensa(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void execute() {
        juego.accion();
    }
}
