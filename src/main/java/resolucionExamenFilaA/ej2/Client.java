package resolucionExamenFilaA.ej2;

public class Client {
    public static void main(String[] args) {
        Televisor t=new Televisor();
        t.setSistemaOperativo("android");
        t.setVersionDelSistemaOperativo("11.0");
        t.setPulgadas(80);
        t.setResolucion(50);
        t.setPuertohdmi(true);
        t.setPuertoUsb(4);
        t.setControlRemoto(true);
        t.setBluetooth(true);

        Televisor t1= (Televisor) t.clone();
        t1.setSerialTelevisor("10 digitos");
        t1.showInfo();
        Televisor t2= (Televisor) t.clone();
        t2.setSerialTelevisor("11 digitos");
        t2.showInfo();
        Televisor t3= (Televisor) t.clone();
        t3.setSerialTelevisor("12 digitos");
        t3.showInfo();
        Televisor t4= (Televisor) t.clone();
        t4.setSerialTelevisor("13 digitos");
        t4.showInfo();
        Televisor t5= (Televisor) t.clone();
        t5.setSerialTelevisor("14 digitos");
        t5.showInfo();
    }
}
