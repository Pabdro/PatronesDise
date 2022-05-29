package resolucionExamenFilaA.ej4;

public class Client {
    public static void main(String[] args) {
        Director jefe=new Director();
        BuilderPaquete megaPaquete= new MegaPaquete();
        BuilderPaquete paqueteMediano= new PaqueteMediano();
        BuilderPaquete paqueteNormal= new PaqueteNormal();
        System.out.println("El cliente quiere");
        jefe.setBuilder(megaPaquete);
        jefe.buildPaquete();
        Paquete p1=jefe.getPaquete();
        p1.showInfo();
        jefe.setBuilder(paqueteMediano);
        jefe.buildPaquete();
        Paquete p2=jefe.getPaquete();
        p2.showInfo();
        jefe.setBuilder(paqueteNormal);
        jefe.buildPaquete();
        Paquete p3=jefe.getPaquete();
        p3.showInfo();
    }
}
