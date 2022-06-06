package mediator.practice.ejrp201;

public class Client {
    public static void main(String[] args) {
        Comunicacion comunicacion=new Comunicacion();

        Equipo a=new Equipo(comunicacion);
        a.setCatalizador("A");
        a.setNombre("jugadorA1");
        a.setRate("10");
        Equipo a2=new Equipo(comunicacion);
        a2.setCatalizador("A");
        a2.setNombre("jugadorA2");
        a2.setRate("11");
        Equipo a3=new Equipo(comunicacion);
        a3.setCatalizador("A");
        a3.setNombre("jugadorA3");
        a3.setRate("100");

        Equipo b=new Equipo(comunicacion);
        b.setCatalizador("B");
        b.setNombre("jugadorB1");
        b.setRate("12");
        Equipo b2=new Equipo(comunicacion);
        b2.setCatalizador("B");
        b2.setNombre("jugadorB2");
        b2.setRate("120");
        Equipo b3=new Equipo(comunicacion);
        b3.setCatalizador("B");
        b3.setNombre("jugadorB3");
        b3.setRate("112");
        comunicacion.addJugadorChat(a)
                .addJugadorChat(a2)
                .addJugadorChat(a3)
                .addJugadorChat(b)
                .addJugadorChat(b2)
                .addJugadorChat(b3);

        a.send("esto es para a3 y a2");
        b.send("esto es para b2 y b3");
    }
}
