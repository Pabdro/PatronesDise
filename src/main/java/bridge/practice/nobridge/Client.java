package bridge.practice.nobridge;

public class Client {
    public static void main(String[] args) {
        Linux linux=new Linux();
        linux.iniciarSO();
        linux.X64();
        linux.X86();

        Windowss windowss=new Windowss();
        windowss.iniciarSO();
        windowss.X64();
        windowss.X86();
    }
}
