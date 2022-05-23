package prototype.practice;

public class Client {
    public static void main(String[] args) {
        Celular celularS= new Celular();
        celularS.setTamanio(13);
        celularS.setCpu("Procesador Samsung");
        celularS.setMemory(100);
        celularS.setVersionAndroid(13);
        celularS.setCamara("108 mega pixeles");
        celularS.setBluetooth(5);
        celularS.setCantidadDeMemoriasExternas(2);
        celularS.setTipoBateria("de litio");
        Accesorios accesoriosS= new Accesorios();
        accesoriosS.setAudifono(true);
        accesoriosS.setCargador(true);
        accesoriosS.setEstuche(true);
        celularS.setAccesorios(accesoriosS);

        Celular celular1 = (Celular) celularS.clone();
        celular1.setNombreTelefonia("Viva");
        celular1.setSimNumero(26452365);

        Celular celular2 = (Celular) celularS.clone();
        celular2.setNombreTelefonia("TIGO");
        celular2.setSimNumero(73256725);

        Celular celular3 = (Celular) celularS.clone();
        celular3.setNombreTelefonia("Entel");
        celular3.setSimNumero(97835275);

        celular1.showInfo();
        celular2.showInfo();
        celular3.showInfo();
    }
}
