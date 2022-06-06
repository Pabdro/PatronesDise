package chainResponsability.practice.ejrchainOfResponsability;

public class Arr500 implements IHandlerArr{
    private IHandlerArr next;
    @Override
    public void setNext(IHandlerArr handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Personas[] personas) {
        if(personas.length>50){
            for (int i = 1; i < personas.length; i++) {
                Personas key = personas[i];
                int j = i - 1;
                while (j >= 0 && personas[j].getEdad() > key.getEdad()) {
                    personas[j + 1] = personas[j];
                    j--;
                }
                personas[j + 1] = key;
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
