package resolucionExamenFilaB.ej5;

public class Division extends OperationD {
    public Division(int digito) {
        this.digito = digito;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("/")){
            context.signo = 3;
            context.input = context.input.substring(this.digito);
        }
    }
}
