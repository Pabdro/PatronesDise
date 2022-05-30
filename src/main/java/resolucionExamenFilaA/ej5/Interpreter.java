package resolucionExamenFilaA.ej5;

import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    private List<OperationMX> grammar =new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpret) {
        context = new Context(msgToInterpret.replace(" ", ""));
        for (String charOriginal : msgToInterpret.split(" ")) {
            switch (charOriginal){
                case "*":
                    grammar.add(new Multiplicacion(charOriginal.length()));
                    break;
                case "+":
                    grammar.add(new Suma(charOriginal.length()));
                    break;
                default:
                    grammar.add(new Numero(charOriginal.length()));
                    break;
            }
        }
    }

    public int evaluateMsg(){
        for (OperationMX expression:grammar) {
            expression.interpreter(context);
        }
        return context.output;
    }
}
