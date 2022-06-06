package chainResponsability.practice.ejrchainOfResponsability;

public class Arr50 implements IHandlerArr{
    private IHandlerArr next;
    @Override
    public void setNext(IHandlerArr handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Personas[] personas) {
        if(personas.length > 20 && personas.length <= 50){
            for (int i = 0; i < personas.length - 1; i++) {
                int min_idx = i;
                for (int j = i + 1; j < personas.length; j++)
                    if (personas[j].getEdad() < personas[min_idx].getEdad()){
                        min_idx = j;
                    }
                Personas temp = personas[min_idx];
                personas[min_idx] = personas[i];
                personas[i] = temp;
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
