package iterator.practice;

import java.util.Vector;

public class IteratorImportadora3 implements Iterator{
    private int position;
    private Vector<Auto> listaAutos;

    public IteratorImportadora3( Vector<Auto> listaAutos){
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
