package builder.practice;

public class Client {
    public static void main(String[] args) {
        Director jefe = new Director();
        BuilderPizza pizzaCarnivora = new PizzaCarnivora();
        BuilderPizza pizzaHawaiana = new PizzaHawaiana();
        BuilderPizza pizzaClasica = new PizzaClasica();

        jefe.setBuilder(pizzaCarnivora);
        jefe.hacerPizza();
        Pizza pizza1 = jefe.getPizzaHecha();
        pizza1.showInfo();

        jefe.setBuilder(pizzaHawaiana);
        jefe.hacerPizza();
        Pizza pizza2 = jefe.getPizzaHecha();
        pizza2.showInfo();

        jefe.setBuilder(pizzaClasica);
        jefe.hacerPizza();
        Pizza pizza3 = jefe.getPizzaHecha();
        pizza3.showInfo();
    }
}
