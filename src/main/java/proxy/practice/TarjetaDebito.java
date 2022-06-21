package proxy.practice;

public class TarjetaDebito implements ICuenta{
    private CuentaBanco cuentaBanco;

    public TarjetaDebito() {
        cuentaBanco = new CuentaBanco(1000);
    }
    @Override
    public void request(Plata plata) {
        if(plata.getMoneda().equals("bolivianos") && plata.getPlata()<=cuentaBanco.getSaldo()){
            cuentaBanco.request(plata);
        } else if(plata.getPlata()>cuentaBanco.getSaldo()){
            System.out.println("error");
        } else {
            cuentaBanco.request(cuentaBanco.cambiarABolivianos(plata));
        }
    }
}
