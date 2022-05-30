package resolucionExamenFilaA.ej1;

public class Auto {
    private String placa;
    private String modelo;
    private String color;
    private int plata;
    public Auto(){}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }
    public void showInfo(){
        System.out.println("placa "+placa);
        System.out.println("modelo "+modelo);
        System.out.println("color "+color);
    }
}
