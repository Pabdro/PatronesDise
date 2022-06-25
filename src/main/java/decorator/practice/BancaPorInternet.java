package decorator.practice;

public class BancaPorInternet extends Decorator {
    private boolean enable;

    public BancaPorInternet(ICuenta componente,boolean enable){
        super(componente);
        this.enable = enable;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("banca Por Internet Esta Habilitado: "+enable);
    }

    @Override
    public Double getMonto() {
        return super.getMonto();
    }

    @Override
    public void setMonto(Double monto) {
        super.setMonto(monto);
    }
}
