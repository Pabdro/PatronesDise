package composite.practice;

public class Computadora extends Component {
    private  int precio=100;
    public Computadora(String name){
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("aumentando una computadora");
    }

    @Override
    public int getPrecio() {
        return precio;
    }

}