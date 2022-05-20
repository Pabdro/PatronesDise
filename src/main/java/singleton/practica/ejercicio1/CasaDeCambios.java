package singleton.practica.ejercicio1;

public class CasaDeCambios {
    private Person persona;

    public CasaDeCambios(Person persona) {
        this.persona = persona;
    }

    public void cambiarDivisaACasaDeCambios(int cantidad, String tipoDivisaEntregada, String tipoDivisaACambiar) {
        System.out.println(persona.getNombre() + " Se necesita cambiar divisas en una casa de cambio de " + tipoDivisaEntregada + " a " + tipoDivisaACambiar);
        TipoDeCambio.getInstance().cambioDivisa(cantidad, tipoDivisaEntregada, tipoDivisaACambiar);
        System.out.println();
    }
}