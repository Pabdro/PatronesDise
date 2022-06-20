package visitor.practice;

public class Client {
    public static void main(String[] args) {
        Librecambista librecambista=new Librecambista();

        Bolivia bolivia=new Bolivia();
        bolivia.setCambio(100,"dolar");
        bolivia.accept(librecambista);

        Argentina argentina = new Argentina();
        argentina.setCambio(100, "peso");
        argentina.accept(librecambista);

        Brasil brasil = new Brasil();
        brasil.setCambio(100, "real");
        brasil.accept(librecambista);

        Italia italia = new Italia();
        italia.setCambio(100, "euro");
        italia.accept(librecambista);
    }
}
