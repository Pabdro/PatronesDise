package state.practice;

import java.util.Random;

public class Prendido implements IStateComputadora{
    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        System.out.println("INFO> Estado Prendido - Resources: ");
        int currentValue=computadora.getConsumoCPU().getCapacidadUtiliza();
        int programas=new Random().nextInt(10);
        computadora.getProgramasAbiertos().setProgramas(programas+ " PROGRAMAS");
        System.out.println(computadora.getProgramasAbiertos().getProgramas());
        int currentValue2=computadora.getConsumoRAM().getCapacidadUtiliza();
        while (currentValue<100) {
            computadora.getConsumoCPU().showInfo();
            computadora.getConsumoRAM().showInfo();
            computadora.getProgramasAbiertos().showInfo();
            Thread.sleep(5000);
            currentValue = currentValue + currentValue2 + programas * 5;
            computadora.getConsumoCPU().setCapacidadUtiliza(currentValue);
        }
        computadora.getConsumoCPU().setCapacidadUtiliza(100);
        System.out.println("100% de uso");
    }
}
