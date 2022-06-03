package memento.practice;

public class Memento {
    private BaseDeDatos state;
    public Memento(BaseDeDatos persona){
        state=persona;
    }
    public BaseDeDatos getState(){
        return state;
    }
}
