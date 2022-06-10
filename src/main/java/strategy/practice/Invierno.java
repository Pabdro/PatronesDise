package strategy.practice;

import java.util.List;

public class Invierno implements IStrategia{
    @Override
    public void execute(List<Ropa> tienda) {
        System.out.println("invierno");
        for (Ropa ropa: tienda){
            ropa.setPrecioEstrategia(ropa.getPrecio() + ropa.getPrecio()*10/100);
            ropa.info();
        }
    }
}
