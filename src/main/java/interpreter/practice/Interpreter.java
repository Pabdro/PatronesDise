package interpreter.practice;

import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    private List<Convertidor> grammar =new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpret) {
        context = new Context(msgToInterpret);
        for (String charOriginal : msgToInterpret.split("")) {
            switch (charOriginal){
                case "1":
                    grammar.add(new T1());
                    break;
                case "2":
                    grammar.add(new T2());
                    break;
                case "3":
                    grammar.add(new T3());
                    break;
                case "4":
                    grammar.add(new T4());
                    break;
                case "5":
                    grammar.add(new T5());
                    break;
                case "6":
                    grammar.add(new T6());
                    break;
                case "7":
                    grammar.add(new T7());
                    break;
                case "8":
                    grammar.add(new T8());
                    break;
                case "9":
                    grammar.add(new T9());
                    break;
                case " ":
                    grammar.add(new TEspacio());
                    break;
                default:
                    break;
            }
        }
    }

    public String evaluateMsg(){
        for (Convertidor expression:grammar) {
            expression.interpreter(context);
        }
        return context.output;
    }
}
