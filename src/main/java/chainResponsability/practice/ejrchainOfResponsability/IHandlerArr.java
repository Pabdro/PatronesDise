package chainResponsability.practice.ejrchainOfResponsability;

public interface IHandlerArr {
    void setNext(IHandlerArr handler);

    void criteriaHandler(Personas[] personas);

    IHandlerArr next();
}
