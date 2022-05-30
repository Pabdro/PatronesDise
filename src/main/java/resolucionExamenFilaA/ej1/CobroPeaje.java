package resolucionExamenFilaA.ej1;

public class CobroPeaje {
    private static CobroPeaje instance;
    private int dinero;

    private CobroPeaje(){
        System.out.println();
    }

    public static CobroPeaje getInstance(){
        if (instance== null)
            instance= new CobroPeaje();
        return instance;
    }

    public void registrarAuto(Auto auto){
        auto.showInfo();
    }

    public void recibirPago(int monto){
        System.out.println("monto recibido: "+monto);
        dinero += monto;
        System.out.println("monto recaudado: "+dinero);
        System.out.println();
    }
}
