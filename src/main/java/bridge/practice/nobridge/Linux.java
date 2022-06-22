package bridge.practice.nobridge;

public class Linux implements IPlataforma{
    @Override
    public void iniciarSO() {
        System.out.println("iniciando linux");
    }

    @Override
    public void X86() {
        System.out.println("iniciando linux x86");
    }

    @Override
    public void X64() {
        System.out.println("iniciado linux x64");
    }
}
