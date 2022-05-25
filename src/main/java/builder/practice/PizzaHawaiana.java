package builder.practice;

public class PizzaHawaiana extends BuilderPizza{

    @Override
    public void buildNombre() {
        this.pizza.setNombre("Pizza Hawaiana");
    }

    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("pina, salsa tomate, otro.");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("masa normal");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("quezo mozarella tipo2");
    }
}
