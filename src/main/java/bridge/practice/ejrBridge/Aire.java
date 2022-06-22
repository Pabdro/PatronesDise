package bridge.practice.ejrBridge;

public class Aire implements IEnvio {

    @Override
    public int enviarPaquete(int precio) {
        int nuevo = precio * 10 / 100;
        return nuevo;
    }

}