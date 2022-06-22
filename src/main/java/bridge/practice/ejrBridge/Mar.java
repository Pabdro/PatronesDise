package bridge.practice.ejrBridge;

public class Mar implements IEnvio {

    @Override
    public int enviarPaquete(int precio) {
        int nuevo = precio * 50 / 100;
        return nuevo;
    }

}
