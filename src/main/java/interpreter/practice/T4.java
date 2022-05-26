package interpreter.practice;

public class T4 extends Convertidor{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("4")){
            context.output = context.output + "IV";
            context.input = context.input.substring(1);
        }
    }
}
