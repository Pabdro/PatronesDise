package resolucionExamenFilaA.ej5;

public class Multiplicacion extends OperationMX {
    public Multiplicacion(int digito) {
        this.digito = digito;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("*")){
            context.signo = 3;
            context.input = context.input.substring(this.digito);
        }
    }
}
