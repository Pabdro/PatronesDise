package visitor.practice;

public interface IPaises {
    void accept(ICambio visitor);
    void setCambio(double cambio, String name);
}
