package iterator.practice;

public class IteratorImportadora1 implements Iterator{
    private int position;
    private Auto[] listaAutos;

    public IteratorImportadora1( Auto [] listaAutos){
        this.listaAutos =listaAutos;
    }

    @Override
    public Object next() {
        return listaAutos[position++];
    }

    @Override
    public boolean hasNext() {
        return listaAutos.length != 0 && position < listaAutos.length;
    }
}
