package proxy.practice;

public class Client {
    public static void main(String[] args) {
        ICuenta cuenta=new TarjetaDebito();

        cuenta.request(new Plata(200, "bolivianos"));
        cuenta.request(new Plata(100, "dolares"));
    }
}
