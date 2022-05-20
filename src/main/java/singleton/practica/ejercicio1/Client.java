package singleton.practica.ejercicio1;

public class Client {
    public static void main(String[] args) {
        Person gabriel = new Person();
        gabriel.setNombre("Gabriel");

        Person marcos = new Person();
        marcos.setNombre("Marcos");

        Person jomy = new Person();
        jomy.setNombre("Jomy");

        Banco banco = new Banco(gabriel,"BNB");
        banco.cambiarDivisaABanco(10,"Dolar","Boliviano");
        banco.cambiarDivisaABanco(80,"Boliviano","Euro");

        CasaDeCambios casaDeCambio = new CasaDeCambios(jomy);
        casaDeCambio.cambiarDivisaACasaDeCambios(70,"Euro","Boliviano");
        casaDeCambio.cambiarDivisaACasaDeCambios(24,"Boliviano","Dolar");

        LibreCambistas libreCambista = new LibreCambistas(marcos);
        casaDeCambio.cambiarDivisaACasaDeCambios(100,"Euro","Boliviano");
        libreCambista.cambiarDivisaLibrecambistas(7000,"Boliviano","Euro");
    }
}