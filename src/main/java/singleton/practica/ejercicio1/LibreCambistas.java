package singleton.practica.ejercicio1;

import java.text.SimpleDateFormat;

public class LibreCambistas {
    private Person persona;

    public LibreCambistas(Person persona) {
        this.persona = persona;
    }

    public void cambiarDivisaLibrecambistas(int cantidad, String tipoDivisaEntregada, String tipoDivisaACambiar){
        System.out.println(persona.getNombre() + " Se necesita cambiar divisas con un libre cambista de " + tipoDivisaEntregada + " a " + tipoDivisaACambiar);
        TipoDeCambio.getInstance().cambioDivisa(cantidad, tipoDivisaEntregada, tipoDivisaACambiar);
        System.out.println();
    }
}