package builder.practice;

public class Director {
    private BuilderPizza builder;

    public Pizza getPizzaHecha() {
        return builder.getProduct();
    }

    public void setBuilder(BuilderPizza builder) {
        this.builder = builder;
    }

    public void hacerPizza(){
        this.builder.createPizza();
        this.builder.buildNombre();
        this.builder.buildIngredientes();
        this.builder.buildTipoMasa();
        this.builder.buildTipoQueso();
    }
}
