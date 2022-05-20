package singleton.practica.ejercicio1;

public class TipoDeCambio {

    private static TipoDeCambio TipoDeCambio;
    private int caBs = 1;
    private int caDolar = 7;
    private int cEuro = 9;


    private TipoDeCambio(){
    }

    public static TipoDeCambio getInstance(){
        if (TipoDeCambio==null)
            TipoDeCambio= new TipoDeCambio();
        return TipoDeCambio;
    }

    public void cambioDivisa(int cantidad, String tipoDivisaEntregada , String tipoDivisaACambiar){

        if (tipoDivisaEntregada.equals("Boliviano") && tipoDivisaACambiar.equals("Dolar")){
            caBsDolar(cantidad);
        } else if (tipoDivisaEntregada.equals("Dolar") && tipoDivisaACambiar.equals("Boliviano")) {
            caDolarBs(cantidad);
        } else if (tipoDivisaEntregada.equals("Boliviano") && tipoDivisaACambiar.equals("Euro")) {
            caBsEuro(cantidad);
        } else {
            caEuroBs(cantidad);
        }

    }

    public void caBsDolar(int Bs){
        int cambio = Bs/ caDolar;
        System.out.println("Bs: "+ Bs + "-----> " + "$: " + cambio);
    }

    public void caBsEuro(int Bs){
        int cambio = Bs* cEuro;
        System.out.println("Bs: "+ Bs + "-----> " + "€: " + cambio);
    }

    public void caDolarBs(int Dolar){
        int cambio = caDolar *Dolar;
        System.out.println("$: "+ Dolar + "-----> " + "Bs: " + cambio);
    }
    public void caEuroBs(int Euro){
        int cambio = cEuro *Euro;
        System.out.println("€: "+ Euro + "-----> " + "Bs: " + cambio);
    }
}