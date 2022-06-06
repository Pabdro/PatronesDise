package chainResponsability.practice.ejrchainOfResponsability;

public class ArrHandler implements IHandlerArr {

    private IHandlerArr next;

    @Override
    public void setNext(IHandlerArr handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Personas[] personas) {
        Arr20 resp1 = new Arr20();
        this.setNext(resp1);

        Arr50 resp2 = new Arr50();
        resp1.setNext(resp2);

        Arr500 resp3 = new Arr500();
        resp2.setNext(resp3);

        this.next.criteriaHandler(personas);

    }

    @Override
    public IHandlerArr next() {
        return next;
    }
}
