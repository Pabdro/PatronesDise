package chainResponsability.practice.ejrchainOfResponsability;

public class Arr20 implements IHandlerArr{
    private IHandlerArr next;
    @Override
    public void setNext(IHandlerArr handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Personas[] personas) {
        if(personas.length<=20){
            Personas aux;
            for (int i = 0; i < personas.length - 1; i++) {
                for (int j = 0; j < personas.length - i - 1; j++) {
                    if (personas[j + 1].getEdad() < personas[j].getEdad()) {
                        aux = personas[j + 1];
                        personas[j + 1] = personas[j];
                        personas[j] = aux;
                    }
                }
            }
        }else{
            next.criteriaHandler(personas);
        }
    }

    @Override
    public IHandlerArr next() {
        return next;
    }
}
