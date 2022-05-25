package builder.practice;

public class PizzaClasica extends BuilderPizza{

    @Override
    public void buildNombre() {
        this.pizza.setNombre("Pizza Clasica");
    }

    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("salsa tomate, otro.");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("masa especial");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("doble quezo mozarella tipo2");
    }
}
