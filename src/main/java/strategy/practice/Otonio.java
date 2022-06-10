package strategy.practice;

import java.util.List;

public class Otonio implements IStrategia{
    @Override
    public void execute(List<Ropa> tienda) {
        System.out.println("otoño");
        for (Ropa ropa: tienda){
            ropa.setPrecioEstrategia(ropa.getPrecio() - ropa.getPrecio()*50/100);
            ropa.info();
        }
    }
}
