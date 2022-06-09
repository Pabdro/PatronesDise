package state.practice;

public class Reiniciar implements IStateComputadora {


    @Override
    public void resourceManager(Computadora computer) throws InterruptedException {
        System.out.println("INFO> Estado Reiniciando - Resources: ");
        computer.getConsumoCPU().setCapacidadUtiliza(0);
        computer.getConsumoCPU().setCapacidadUtiliza(0);
        computer.getProgramasAbiertos().setProgramas("programas cerrados");
        computer.getConsumoRAM().showInfo();
        computer.getConsumoCPU().showInfo();
        computer.getProgramasAbiertos().showInfo();
    }
}