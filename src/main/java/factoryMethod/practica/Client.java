package factoryMethod.practica;

public class Client {
    public static void main (String []args){

        Pasajero gabo=new Pasajero();
        gabo.setNombre("Gabriel Neme");
        gabo.setCi(75667969);

        Pasajero richy=new Pasajero();
        richy.setNombre("Richard Rojas");
        richy.setCi(14233253);

        Pasajero mike=new Pasajero();
        mike.setNombre("Miguel Molina");
        mike.setCi(923457456);

        Pasajero ari=new Pasajero();
        ari.setNombre("Ariane Garrett");
        ari.setCi(572371432);

        Pasajero jomy=new Pasajero();
        jomy.setNombre("Joseph Meneses");
        jomy.setCi(847384053);
        jomy.setFechaNacimiento("23/5/2012");

        Pasajero marcos=new Pasajero();
        marcos.setNombre("Marcos Simon");
        marcos.setCi(69546113);
        marcos.setFechaNacimiento("13/3/2013");

        PasajeStandart p1 = (PasajeStandart) new CreatorPasajeStandart().createPasage(gabo, 6);
        p1.showInfo();
        PasajeStandart p2 = (PasajeStandart) new CreatorPasajeStandart().createPasage(richy, 15);
        p2.showInfo();

        PasajeSolidario p3 = (PasajeSolidario) new CreatorPasajeSolidario().createPasage(mike, 13);
        p3.showInfo();
        PasajeSolidario p4 = (PasajeSolidario) new CreatorPasajeSolidario().createPasage(ari, 22);
        p4.showInfo();

        PasajeInfantes p5 = (PasajeInfantes) new CreatorPasajeInfantes().createPasage(jomy, 30);
        p5.showInfo();
        PasajeInfantes p6 = (PasajeInfantes) new CreatorPasajeInfantes().createPasage(marcos, 19);
        p6.showInfo();


    }
}
