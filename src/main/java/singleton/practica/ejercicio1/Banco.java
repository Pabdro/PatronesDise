package singleton.practica.ejercicio1;

public class Banco {
    private Person persona;
    private String nombre;
    public Banco(Person persona, String nombre) {

        this.persona = persona;
        this.nombre = nombre;

    }

    public void cambiarDivisaABanco(int cantidad, String tipoDivisaEntregada, String tipoDivisaACambiar){

        System.out.println(persona.getNombre() + " Se necesita cambiar divisas con el banco de " + tipoDivisaEntregada + " a " + tipoDivisaACambiar);
        TipoDeCambio.getInstance().cambioDivisa(cantidad, tipoDivisaEntregada, tipoDivisaACambiar);
        System.out.println();

    }
}