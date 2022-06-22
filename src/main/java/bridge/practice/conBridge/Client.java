package bridge.practice.conBridge;

public class Client {
    public static void main(String[] args) {
        ArquitecturaX64 arquitecturaX64 = new ArquitecturaX64();
        Linux linux = new Linux(arquitecturaX64);

        linux.usarSO();

        ArquitecturaX86 arquitecturaX86 = new ArquitecturaX86();
        Windows windows = new Windows(arquitecturaX86);

        windows.usarSO();

    }
}
