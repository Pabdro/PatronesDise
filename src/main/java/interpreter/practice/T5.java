package interpreter.practice;

public class T5 extends Convertidor{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("5")){
            context.output = context.output + "V";
            context.input = context.input.substring(1);
        }
    }
}
