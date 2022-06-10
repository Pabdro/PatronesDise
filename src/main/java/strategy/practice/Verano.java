package strategy.practice;

import java.util.List;

public class Verano implements IStrategia{
    @Override
    public void execute(List<Ropa> tienda) {
        System.out.println("verano");
        for (Ropa ropa: tienda){
            ropa.setPrecioEstrategia(ropa.getPrecio() - ropa.getPrecio()*10/100);
            ropa.info();
        }
    }
}
