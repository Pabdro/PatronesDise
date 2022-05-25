package builder.practice;

public class PizzaCarnivora extends BuilderPizza{
    @Override
    public void buildNombre() {
        this.pizza.setNombre("Pizza Carnivora");
    }

    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("carne, salsa tomate, otro.");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("masa especial");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("quezo mozarella");
    }
}
