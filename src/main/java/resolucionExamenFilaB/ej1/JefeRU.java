package resolucionExamenFilaB.ej1;

import java.util.Date;

public class JefeRU {
    public JefeRU(){}
    public void registrarTesis(TemaDeTesis tesis, Date date) {
        DatosDeLaTesis.getInstance().registrarTesis(tesis, date);
    }
    public void mostrarDatosRegistro() {
        DatosDeLaTesis.getInstance().mostrarRegistro();
    }
}
