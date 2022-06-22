package bridge.practice.ejrBridge;

public class Client {
    public static void main(String[] args) {
        Tierra terrestre = new Tierra();
        Aire aereo = new Aire();
        Mar maritimo = new Mar();
        EmpresaSRL srl = new EmpresaSRL(maritimo, "comida", 100);
        EmpresaSA sa = new EmpresaSA(aereo, "muebles", 100);
        EmpresaSA sa2 = new EmpresaSA(terrestre, "cristales", 100);
        srl.infoPaquete();
        sa.infoPaquete();
        sa2.infoPaquete();
    }
}
