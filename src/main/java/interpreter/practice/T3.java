package interpreter.practice;

public class T3 extends Convertidor{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("3")){
            context.output = context.output + "III";
            context.input = context.input.substring(1);
        }
    }
}
