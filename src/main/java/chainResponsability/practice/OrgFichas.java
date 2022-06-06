package chainResponsability.practice;

public class OrgFichas implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        if (persona.getPagoBanco() && persona.getCertificadoNacimiento() && !persona.getFichaAtencion()){
            System.out.println("Tarea atendida por el organizador de fichas");
        }
        else{
            next.criteriaHandler(persona);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}