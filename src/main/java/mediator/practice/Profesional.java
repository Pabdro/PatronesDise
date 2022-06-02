package mediator.practice;

public class Profesional extends Persona{
    public Profesional(ICanalComunicacion canalComunication) {
        super(canalComunication);
    }

    @Override
    public void send(String msg) {
        canalComunication.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("INFO> name: "+getName()+ " ci: "+getCi()+ " tipo: "+getTipo());
        System.out.println("INFO> received "+msg);
    }
}
