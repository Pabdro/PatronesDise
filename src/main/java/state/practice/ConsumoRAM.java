package state.practice;

public class ConsumoRAM {
    String capacidadTotal;
    int capacidadUtiliza;
    String description;

    public ConsumoRAM(){}
    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public int getCapacidadUtiliza() {
        return capacidadUtiliza;
    }

    public String getDescription() {
        return description;
    }

    public ConsumoRAM setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        return this;
    }

    public ConsumoRAM setCapacidadUtiliza(int capacidadUtiliza) {
        this.capacidadUtiliza = capacidadUtiliza;
        return this;
    }

    public ConsumoRAM setDescription(String description) {
        this.description = description;
        return this;
    }

    public void showInfo(){
        System.out.println("**** memoria ram ****");
        System.out.println("capacidadTotal: "+capacidadTotal);
        System.out.println("capacidadUtiliza: "+capacidadUtiliza);
        System.out.println("description: "+description);
    }
}
