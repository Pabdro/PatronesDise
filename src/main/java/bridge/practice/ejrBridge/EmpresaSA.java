package bridge.practice.ejrBridge;

public class EmpresaSA implements IEmpresa {
    private IEnvio envio;
    private int precio;
    private String nombre;

    public EmpresaSA(IEnvio envio, String nombre, int precio) {
        this.envio = envio;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void infoPaquete() {
        int impuesto = precio + envio.enviarPaquete(precio);
        System.out.println("EmpresaSA enviar el paquete de " + nombre + " (" + precio + "$)" + ", seran " + impuesto + "$.");

    }

}