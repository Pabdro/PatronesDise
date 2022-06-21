package proxy.practice;

public class CuentaBanco implements ICuenta{
    int saldo;

    public CuentaBanco(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
    @Override
    public void request(Plata plata) {
        plata.showInfo();
        saldo=saldo-plata.getPlata();
        System.out.println("el saldo actual es: "+saldo);
    }
    public Plata cambiarABolivianos(Plata plata) {
        if(plata.getMoneda().equals("dolares")){
            return new Plata(plata.getPlata() * 7, "bolivianos");
        } else {
            System.out.println("Moneda incorrecta");
            return new Plata(0, "bolivianos");
        }
    }
}
