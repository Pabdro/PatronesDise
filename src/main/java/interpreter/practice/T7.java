package interpreter.practice;

public class T7 extends Convertidor{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("7")){
            context.output = context.output + "VII";
            context.input = context.input.substring(1);
        }
    }
}
