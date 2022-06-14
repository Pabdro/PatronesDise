package mediator.practice;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalComunicacion{
    Map<Persona, String> map = new HashMap<Persona, String>();
    public void addToChat(Persona persona){

        map.put(persona, persona.getTipo());
    }
    @Override
    public void send(String msg, Persona persona) {
        Persona emisor = (Persona) persona;
        for (Persona p : map.keySet()) {
            if(!emisor.getCi().equals(p.getCi())){
                if(emisor.getTipo().equals("gradoQA") && p.getTipo().equals("gradoQA")){
                    p.received(msg);
                } else if (emisor.getTipo().equals("lenguaje") && p.getTipo().equals("lenguaje")){
                    p.received(msg);
                } else if (emisor.getTipo().equals("certificaciones")) {
                    p.received(msg);
                }
            }
        }
    }
}
