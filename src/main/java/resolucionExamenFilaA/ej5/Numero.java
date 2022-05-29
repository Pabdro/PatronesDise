package resolucionExamenFilaA.ej5;

public class Numero extends OperationMX {

    public Numero(int digito) {
        this.digito = digito;
    }

    @Override
    public void interpreter(Context context) {
        context.output = context.output + (Integer.parseInt(context.input.substring(0, this.digito)) * context.signo);
        context.input = context.input.substring(this.digito);
    }
}