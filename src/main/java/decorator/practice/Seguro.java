package decorator.practice;

public class Seguro extends Decorator {
    private double descontar=10;
    public Seguro(ICuenta componente){
        super(componente);
    }

    public void showInfo() {
        System.out.println("descontando seguro");
        super.setMonto(super.getMonto()-descontar);
        super.showInfo();
    }
}