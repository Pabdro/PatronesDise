package state.practice;

public class Computadora {
    private IStateComputadora stateComputadora;
    private ProgramasAbiertos programasAbiertos;
    private ConsumoCPU consumoCPU;
    private ConsumoRAM consumoRAM;

    public Computadora() {
        programasAbiertos=new ProgramasAbiertos();
        consumoCPU=new ConsumoCPU();
        consumoRAM=new ConsumoRAM();
        programasAbiertos.setProgramas("muchos programas");
        consumoCPU.setCapacidadTotal("1g").setCapacidadUtiliza(5).setDescription("cpu");
        consumoRAM.setCapacidadTotal("16g").setCapacidadUtiliza(5).setDescription("rizen");
        stateComputadora=new Apagado();
    }

    public IStateComputadora getStateComputadora() {
        return stateComputadora;
    }

    public void setStateComputadora(IStateComputadora stateComputadora) {
        this.stateComputadora = stateComputadora;
    }

    public ProgramasAbiertos getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(ProgramasAbiertos programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public ConsumoCPU getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(ConsumoCPU consumoCPU) {
        this.consumoCPU = consumoCPU;
    }

    public ConsumoRAM getConsumoRAM() {
        return consumoRAM;
    }

    public void setConsumoRAM(ConsumoRAM consumoRAM) {
        this.consumoRAM = consumoRAM;
    }
    public void resourceManager() throws InterruptedException {
        stateComputadora.resourceManager(this);
    }
}
