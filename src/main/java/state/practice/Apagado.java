package state.practice;

public class Apagado implements IStateComputadora {


    @Override
    public void resourceManager(Computadora computer) throws InterruptedException {
        System.out.println("INFO> Estado Apagado - Resources: ");
        computer.getConsumoCPU().setCapacidadUtiliza(0);
        computer.getConsumoCPU().setCapacidadUtiliza(0);
        computer.getConsumoRAM().showInfo();
        computer.getConsumoCPU().showInfo();
        computer.getProgramasAbiertos().showInfo();
    }
}