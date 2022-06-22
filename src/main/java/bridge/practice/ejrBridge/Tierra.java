package bridge.practice.ejrBridge;

public class Tierra implements IEnvio {

    @Override
    public int enviarPaquete(int precio) {
        int nuevo = precio * 5 / 100;
        return nuevo;
    }

}
