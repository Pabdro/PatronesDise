package visitor.practice;

public class Bolivia implements IPaises{
    private String name;
    private double cambio;
    public Bolivia(){
    }
    @Override
    public void accept(ICambio visitor) {
        visitor.cambio(this);
    }

    @Override
    public void setCambio(double cambio, String name) {
        this.name=name;
        this.cambio=cambio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("Pais");
        System.out.println(name);
        System.out.println();
    }

    public double getCambio() {
        return cambio;
    }
}
