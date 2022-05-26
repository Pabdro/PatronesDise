package interpreter.practice;

public class T2 extends Convertidor{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("2")){
            context.output = context.output + "II";
            context.input = context.input.substring(1);
        }
    }
}
