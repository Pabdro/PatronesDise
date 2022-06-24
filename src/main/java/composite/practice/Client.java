package composite.practice;

public class Client {
    public static void main(String []args){
        CompositeComputadora laboratorio1 = new CompositeComputadora("LABORATORIO 1");
        laboratorio1.add(new Computadora("PC1"));
        laboratorio1.add(new Computadora("PC2"));
        laboratorio1.add(new Computadora("PC3"));
        laboratorio1.getPrecio();
        System.out.println();

        CompositeComputadora laboratorio2 = new CompositeComputadora("LABORATORIO 2");
        laboratorio2.add(new Computadora("PC4"));
        laboratorio2.add(new Computadora("PC5"));
        laboratorio2.add(new Computadora("PC6"));
        laboratorio2.add(new Computadora("PC7"));
        laboratorio2.getPrecio();
        System.out.println();

        CompositeComputadora container1=new CompositeComputadora("CONTENEDOR");
        container1.add(laboratorio1);
        container1.add(laboratorio2);
        container1.getPrecio();
        System.out.println();
    }
}
