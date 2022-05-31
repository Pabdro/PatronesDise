package iterator.practice;

import java.util.Vector;

public class Importadora3 implements IAggregate{
    private Vector<Auto> listaAutos;

    public Importadora3(){
        listaAutos = new Vector<Auto>();
    }

    public void add (Auto value){
        listaAutos.add(value);
    }

    @Override
    public IteratorImportadora3 createIterator() {
        return new IteratorImportadora3(listaAutos);
    }
}