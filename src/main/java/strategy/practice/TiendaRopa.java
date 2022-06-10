package strategy.practice;

import java.util.ArrayList;
import java.util.List;

public class TiendaRopa {
    private List<Ropa> ropaList= new ArrayList<>();
    private IStrategia estrategia;
    public TiendaRopa(){}

    public IStrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(IStrategia estrategia) {
        this.estrategia = estrategia;
    }
    public void addRopa(Ropa ropa){
        ropaList.add(ropa);
    }
    public void iniciarEstrategia(){
        estrategia.execute(ropaList);
    }
}
