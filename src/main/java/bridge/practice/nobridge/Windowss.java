package bridge.practice.nobridge;

public class Windowss implements IPlataforma{
    @Override
    public void iniciarSO() {
        System.out.println("iniciando windows");
    }

    @Override
    public void X86() {
        System.out.println("iniciando windows x86");
    }

    @Override
    public void X64() {
        System.out.println("iniciado windows x64");
    }
}
