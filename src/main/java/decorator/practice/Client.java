package decorator.practice;

public class Client {
    public static void main(String[] args) {
        ICuenta cuentaBasica = new CuentaBasica("Marcos",1000.0);
        cuentaBasica = new BancaPorInternet(cuentaBasica,true);
        cuentaBasica = new Seguro(cuentaBasica);
        cuentaBasica = new Promocion(cuentaBasica);

        cuentaBasica.showInfo();
    }
}
