package state.practice;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Computadora computadora=new Computadora();
        computadora.setStateComputadora(new Prendido());
        computadora.resourceManager();
    }
}
