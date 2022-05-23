package prototype.practice;

public class Celular {
    private int tamanio;
    private String cpu;
    private int memory;
    private int simNumero;
    private String nombreTelefonia;
    private int versionAndroid;
    private String camara;
    private int bluetooth;
    private int cantidadDeMemoriasExternas;
    private String tipoBateria;

    public int getSimNumero() {
        return simNumero;
    }

    public void setSimNumero(int simNumero) {
        this.simNumero = simNumero;
    }

    public String getNombreTelefonia() {
        return nombreTelefonia;
    }

    public void setNombreTelefonia(String nombreTelefonia) {
        this.nombreTelefonia = nombreTelefonia;
    }

    private Accesorios accesorios = new Accesorios();

    public Celular() {}

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(int versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public int getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(int bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getCantidadDeMemoriasExternas() {
        return cantidadDeMemoriasExternas;
    }

    public void setCantidadDeMemoriasExternas(int cantidadDeMemoriasExternas) {
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public Accesorios getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public Object clone() {
        Accesorios cloneA = new Accesorios();
        cloneA.setAudifono(this.getAccesorios().getAudifono());
        cloneA.setCargador(this.getAccesorios().getCargador());
        cloneA.setEstuche(this.getAccesorios().getEstuche());

        Celular cloneC = new Celular();
        cloneC.setTamanio(this.getTamanio());
        cloneC.setCpu(this.getCpu());
        cloneC.setMemory(this.getMemory());
        cloneC.setVersionAndroid(this.getVersionAndroid());
        cloneC.setCamara(this.getCamara());
        cloneC.setBluetooth(this.getBluetooth());
        cloneC.setCantidadDeMemoriasExternas(this.getCantidadDeMemoriasExternas());
        cloneC.setTipoBateria(this.getTipoBateria());
        cloneC.setAccesorios(cloneA);
        cloneC.setSimNumero(getSimNumero());
        cloneC.setNombreTelefonia(getNombreTelefonia());
        return cloneC;
    }

    public void showInfo() {
        System.out.println(" \n *** Informacion del celular *** \n");
        System.out.println("tamanio: "+tamanio);
        System.out.println("cpu: "+cpu);
        System.out.println("memory: "+memory);
        System.out.println("sim nombre Empresa Tel: "+nombreTelefonia);
        System.out.println("sim numero Telefono: "+simNumero);
        System.out.println("version Android: "+versionAndroid);
        System.out.println("camara: "+camara);
        System.out.println("bluetooth: "+bluetooth);
        System.out.println("cantidad de memorias externas: "+cantidadDeMemoriasExternas);
        System.out.println("tipo de bateria: "+tipoBateria);
        System.out.println("Accesorios audifono: "+accesorios.getAudifono());
        System.out.println("Accesorios cargador: "+accesorios.getCargador());
        System.out.println("Accesorios estuche: "+accesorios.getEstuche());
    }

}