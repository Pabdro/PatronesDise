package composite.practice;

abstract class Component {
    private String name;
    public Component(String name)    {
        this.name =name;
        System.out.println(name);
    }
    public String getName(){
        return this.name;
    }
    public abstract void add(Component component);
    public abstract int getPrecio();
}