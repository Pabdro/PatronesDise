package resolucionExamenFilaA.ej2;

public class Televisor implements ITelevisor{
    private String sistemaOperativo;
    private String versionDelSistemaOperativo;
    private int pulgadas;
    private int resolucion;
    private boolean puertohdmi;
    private int puertoUsb;
    private boolean controlRemoto;
    private boolean bluetooth;
    private String serialTelevisor;
    public Televisor(){

    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getVersionDelSistemaOperativo() {
        return versionDelSistemaOperativo;
    }

    public void setVersionDelSistemaOperativo(String versionDelSistemaOperativo) {
        this.versionDelSistemaOperativo = versionDelSistemaOperativo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertohdmi() {
        return puertohdmi;
    }

    public void setPuertohdmi(boolean puertohdmi) {
        this.puertohdmi = puertohdmi;
    }

    public int getPuertoUsb() {
        return puertoUsb;
    }

    public void setPuertoUsb(int puertoUsb) {
        this.puertoUsb = puertoUsb;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerialTelevisor() {
        return serialTelevisor;
    }

    public void setSerialTelevisor(String serialTelevisor) {
        this.serialTelevisor = serialTelevisor;
    }
    @Override
    public Object clone(){
        Televisor clone = new Televisor();
        clone.setSistemaOperativo(this.getSistemaOperativo());
        clone.setVersionDelSistemaOperativo(this.getVersionDelSistemaOperativo());
        clone.setPulgadas(this.getPulgadas());
        clone.setResolucion(this.getResolucion());
        clone.setPuertohdmi(this.isPuertohdmi());
        clone.setPuertoUsb(this.getPuertoUsb());
        clone.setControlRemoto(this.isControlRemoto());
        clone.setBluetooth(this.isBluetooth());
        clone.setSerialTelevisor(this.getSerialTelevisor());
        return clone;
    }
    public void showInfo(){
        System.out.println("informacion de la television");
        System.out.println("sistema operativo: "+sistemaOperativo);
        System.out.println("version del sistema operativo: "+versionDelSistemaOperativo);
        System.out.println("pulgadas: "+pulgadas);
        System.out.println("resolucion: "+resolucion);
        System.out.println("puerto hdmi: "+puertohdmi);
        System.out.println("puertos usb: "+puertoUsb);
        System.out.println("control remoto: "+controlRemoto);
        System.out.println("bluetooth: "+bluetooth);
        System.out.println("serial del televisor: "+serialTelevisor);
    }

}
