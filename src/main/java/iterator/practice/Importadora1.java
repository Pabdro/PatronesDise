package iterator.practice;

public class Importadora1 implements IAggregate{
    private int position;
    private Auto [] listaAutos;

    public Importadora1(){
        listaAutos = new Auto[1];
    }

    public void add (Auto value){
        listaAutos[position]=value;
        position++;
    }

    @Override
    public IteratorImportadora1 createIterator() {
        return new IteratorImportadora1(listaAutos);
    }
}
