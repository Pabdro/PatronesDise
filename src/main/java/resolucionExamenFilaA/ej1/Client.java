package resolucionExamenFilaA.ej1;

public class Client {
    public static void main(String[] args) {
        CobroPeaje cp = CobroPeaje.getInstance();
        Auto auto1 = new Auto();
        auto1.setPlaca("1234QWE");
        auto1.setModelo("subaru");
        auto1.setColor("azul");
        auto1.setPlata(50);
        cp.registrarAuto(auto1);
        cp.recibirPago(auto1.getPlata());

        Auto auto2 = new Auto();
        auto2.setPlaca("5678RTY");
        auto2.setModelo("golf");
        auto2.setColor("rosado");
        auto2.setPlata(50);
        cp.registrarAuto(auto2);
        cp.recibirPago(auto2.getPlata());

        Auto auto3 = new Auto();
        auto3.setPlaca("9012UIO");
        auto3.setModelo("toyota");
        auto3.setColor("dorado");
        auto3.setPlata(50);
        cp.registrarAuto(auto3);
        cp.recibirPago(auto3.getPlata());

        Auto auto4 = new Auto();
        auto4.setPlaca("3456ASD");
        auto4.setModelo("nissan");
        auto4.setColor("blanco");
        auto4.setPlata(50);
        cp.registrarAuto(auto4);
        cp.recibirPago(auto4.getPlata());

        Auto auto5 = new Auto();
        auto5.setPlaca("7890FGH");
        auto5.setModelo("mitzubishi");
        auto5.setColor("negro");
        auto5.setPlata(50);
        cp.registrarAuto(auto5);
        cp.recibirPago(auto5.getPlata());

        Auto auto6 = new Auto();
        auto6.setPlaca("3456CVB");
        auto6.setModelo("suzuki");
        auto6.setColor("morado");
        auto6.setPlata(50);
        cp.registrarAuto(auto6);
        cp.recibirPago(auto6.getPlata());
    }
}
