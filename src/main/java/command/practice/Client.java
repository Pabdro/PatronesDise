package command.practice;

public class Client {
    public static void main(String[] args) {
        Juego ja=new Juego();
        Juego jmd=new Juego();
        Juego jd=new Juego();
        ja.setAccion("atacar");
        jmd.setAccion("modo defensa");
        jd.setAccion("disparar");

        Atacar atacar=new Atacar(ja);
        ModoDefensa modoDefensa=new ModoDefensa(jmd);
        Disparar disparar=new Disparar(jd);

        Invoker invoker=new Invoker();

        invoker.addCommand(atacar);
        invoker.addCommand(modoDefensa);
        invoker.addCommand(disparar);

        invoker.runCommands();
    }
}
