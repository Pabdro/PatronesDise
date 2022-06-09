package state.practice;

public class ConsumoCPU {
    String capacidadTotal;
    int capacidadUtiliza;
    String description;

    public ConsumoCPU(){}
    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public int getCapacidadUtiliza() {
        return capacidadUtiliza;
    }

    public String getDescription() {
        return description;
    }

    public ConsumoCPU setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        return this;
    }

    public ConsumoCPU setCapacidadUtiliza(int capacidadUtiliza) {
        this.capacidadUtiliza = capacidadUtiliza;
        return this;
    }

    public ConsumoCPU setDescription(String description) {
        this.description = description;
        return this;
    }

    public void showInfo(){
        System.out.println("**** cpu ****");
        System.out.println("capacidadTotal: "+capacidadTotal);
        System.out.println("capacidadUtiliza: "+capacidadUtiliza);
        System.out.println("description: "+description);
    }
}
