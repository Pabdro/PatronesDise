package strategy.practice;

import java.util.List;

public class Primavera implements IStrategia{
    @Override
    public void execute(List<Ropa> tienda) {
        System.out.println("primavera");
        for (Ropa ropa: tienda){
            ropa.setPrecioEstrategia(ropa.getPrecio());
            ropa.info();
        }
    }
}
