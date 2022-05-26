package interpreter.practice;

public class TEspacio extends Convertidor{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){
            context.output = context.output + " ";
            context.input = context.input.substring(1);
        }
    }
}
