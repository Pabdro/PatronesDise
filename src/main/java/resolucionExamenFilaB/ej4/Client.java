package resolucionExamenFilaB.ej4;

public class Client {
    public static void main(String[] args) {
        Director jefe=new Director();
        BuilderContrato hbo=new ContratoHBO();
        BuilderContrato netflix=new ContratoNETFLIX();
        BuilderContrato amazon=new ContratoAMAZON();
        System.out.println("El cliente quiere");
        jefe.setBuilder(hbo);
        jefe.buildProduct();
        Contrato c1=jefe.getContratotBuilder();
        c1.showInfo();
        jefe.setBuilder(netflix);
        jefe.buildProduct();
        Contrato c2=jefe.getContratotBuilder();
        c2.showInfo();
        jefe.setBuilder(amazon);
        jefe.buildProduct();
        Contrato c3=jefe.getContratotBuilder();
        c3.showInfo();
    }
}
