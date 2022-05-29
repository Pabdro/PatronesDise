package resolucionExamenFilaA.ej5;

public class Suma extends OperationMX {
    public Suma(int digito) {
        this.digito = digito;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("+")){
            context.signo = 1;
            context.input = context.input.substring(this.digito);
        }
    }
}
