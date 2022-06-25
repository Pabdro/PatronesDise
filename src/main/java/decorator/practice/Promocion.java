package decorator.practice;

import java.util.Random;

public class Promocion extends Decorator {
    public Promocion(ICuenta componente){
        super(componente);
    }

    public int getRandom(){
        Random r = new Random();
        int bajo = 10;
        int alto = 100;
        int resultado = r.nextInt(alto-bajo) + bajo;
        return  resultado;
    }

    public void showInfo() {
        super.showInfo();
        boolean ganador= getRandom()%2==0;
        if (ganador) {
            super.setMonto(super.getMonto() * 2);
        }
        System.out.println("promocion ganador: "+ganador);
        System.out.println("monto : "+super.getMonto());
    }
}
