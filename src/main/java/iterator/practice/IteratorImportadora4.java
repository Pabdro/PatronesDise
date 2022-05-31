package iterator.practice;

import java.util.Stack;

public class IteratorImportadora4 implements Iterator{
    private int position;
    private Stack<Auto> listaAutos;

    public IteratorImportadora4( Stack<Auto> listaAutos){
        this.listaAutos =listaAutos;
    }

    @Override
    public Object next() {
        return listaAutos.get(position++);
    }

    @Override
    public boolean hasNext() {
        return listaAutos.size() != 0 && position < listaAutos.size();
    }
}
