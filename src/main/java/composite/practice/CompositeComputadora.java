package composite.practice;

import java.util.ArrayList;

public class CompositeComputadora extends Component {
    private int precio=0;
    private ArrayList<Component> list = new ArrayList<>();

    public CompositeComputadora(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public int getPrecio() {
        precio=0;
        for (Component comp: list ) {
            precio = precio+comp.getPrecio();
        }
        System.out.println(this.getName()+ " Precio: "+this.precio);
        return precio;
    }
}
