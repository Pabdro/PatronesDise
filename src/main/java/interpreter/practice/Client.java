package interpreter.practice;

public class Client {
    public static void main(String[] args) {
        String e1="1 2 3 4 5 6 7 8 9 10";
        String e2="1 5";
        Interpreter parser1 = new Interpreter(e1);
        System.out.println();
        System.out.println("i.e1:");
        System.out.println();
        System.out.println(""+parser1.evaluateMsg());
        System.out.println();
        Interpreter parser2 = new Interpreter(e2);
        System.out.println();
        System.out.println("i.e1:");
        System.out.println();
        System.out.println(""+parser2.evaluateMsg());
        System.out.println();
    }
}
