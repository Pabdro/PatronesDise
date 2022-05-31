package iterator.practice;

import java.util.ArrayList;
import java.util.List;

public class Importadora2 implements IAggregate{
    private List<Auto> listaAutos;

    public Importadora2(){
        listaAutos = new ArrayList<Auto>();
    }

    public void add (Auto value){
        listaAutos.add(value);
    }

    @Override
    public IteratorImportadora2 createIterator() {
        return new IteratorImportadora2(listaAutos);
    }
}
