package mediator.practice.ejrp201;

import java.util.ArrayList;
import java.util.List;

public class Comunicacion implements ICanal{
    List<Equipo> equipos=new ArrayList<>();
    public Comunicacion addJugadorChat(Equipo equipo){
        equipos.add(equipo);
        return this;
    }
    @Override
    public void send(String msg, Jugador jugador) {
        Equipo emisor = (Equipo) jugador;
        for ( Equipo equipo : equipos  ) {
            if (!emisor.getRate().equals(equipo.getRate())){
                if(emisor.getCatalizador().equals("A") && equipo.getCatalizador().equals("A")){
                    equipo.received(msg);
                }else if (emisor.getCatalizador().equals("B") && equipo.getCatalizador().equals("B")){
                    equipo.received(msg);
                }
            }
        }
    }
}
