package interpreter.practice;

public class T8 extends Convertidor{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("8")){
            context.output = context.output + "VIII";
            context.input = context.input.substring(1);
        }
    }
}
