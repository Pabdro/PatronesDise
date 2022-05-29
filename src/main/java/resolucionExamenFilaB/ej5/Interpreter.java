package resolucionExamenFilaB.ej5;

import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    private List<OperationD> grammar =new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpret) {
        context = new Context(msgToInterpret.replace(" ", ""));
        for (String charOriginal : msgToInterpret.split(" ")) {
            switch (charOriginal){
                case "/":
                    grammar.add(new Division(charOriginal.length()));
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
        for (OperationD expression:grammar) {
            expression.interpreter(context);
        }
        return context.output;
    }
}
