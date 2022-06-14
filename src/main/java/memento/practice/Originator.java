package memento.practice;

public class Originator {
    private BaseDeDatos state;

    public void setMemento(BaseDeDatos state) {

        this.state = state;
    }
    public Memento createMemento(){

        return  new Memento(state);
    }
    public BaseDeDatos restoreMemento(Memento m){
        System.out.println("RESTAURANDO");
        this.state=m.getState();
        return this.state;
    }
}
