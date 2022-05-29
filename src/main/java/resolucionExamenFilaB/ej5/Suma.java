package resolucionExamenFilaB.ej5;

public class Suma extends OperationD {
    public Suma(int digito) {
        this.digito = digito;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("+")) {
            context.signo = 2;
            context.input = context.input.substring(this.digito);
        }
    }
}
