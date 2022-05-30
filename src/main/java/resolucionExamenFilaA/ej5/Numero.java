package resolucionExamenFilaA.ej5;

public class Numero extends OperationMX {

    public Numero(int digito) {
        this.digito = digito;
    }

    @Override
    public void interpreter(Context context) {
        if(context.signo == 0) {
            context.output = Integer.parseInt(context.input.substring(0, this.digito));
        } else if(context.signo == 3) {
            context.output = context.output * Integer.parseInt(context.input.substring(0, this.digito));
        } else{
            context.output = context.output + Integer.parseInt(context.input.substring(0, this.digito));
        }
        context.input = context.input.substring(this.digito);
    }
}