package iterator.practice;

import java.util.Stack;

public class Importadora4 implements IAggregate{
    private Stack<Auto> listaAutos;

    public Importadora4(){
        listaAutos = new Stack<Auto>();
    }

    public void add (Auto value){
        listaAutos.add(value);
    }

    @Override
    public IteratorImportadora4 createIterator() {
        return new IteratorImportadora4(listaAutos);
    }
}
