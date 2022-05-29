package resolucionExamenFilaB.ej2;

public class Client {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.setModelo("A1");
        celular.setTamano(12);
        celular.setPeso(60);
        Camara camara = new Camara();
        camara.setFoco(10);
        camara.setLente("5mp");
        celular.setCamara(camara);
        celular.setPaisCreado("Bolivia");

        Celular celular1 = (Celular) celular.clone();
        Celular celular2 = (Celular) celular.clone();
        Celular celular3 = (Celular) celular.clone();
        Celular celular4 = (Celular) celular.clone();
        Celular celular5 = (Celular) celular.clone();

        celular1.setImei(10001);
        celular2.setImei(10002);
        celular3.setImei(10003);
        celular4.setImei(10004);
        celular5.setImei(10005);

        celular1.showInfo();
        celular2.showInfo();
        celular3.showInfo();
        celular4.showInfo();
        celular5.showInfo();
    }
}
