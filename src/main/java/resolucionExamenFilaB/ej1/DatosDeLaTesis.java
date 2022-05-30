package resolucionExamenFilaB.ej1;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DatosDeLaTesis {
    private static DatosDeLaTesis instance;
    private Map<TemaDeTesis, Date> registro = new ConcurrentHashMap<>();

    private DatosDeLaTesis() {}

    public static DatosDeLaTesis getInstance() {
        if(instance == null) {
            multiThreadControl();
        }
        return instance;
    }

    private synchronized static void multiThreadControl() {
        if(instance == null) {
            instance = new DatosDeLaTesis();
        }
    }

    public synchronized void registrarTesis(TemaDeTesis tesis, Date date) {
        if(!registro.containsKey(tesis)) {
            System.out.println("tesis del estudiante: "+tesis.getDatosDelEstudiante().getNombre()+" fecha: "+date);
            registro.put(tesis, date);
        } else {
            System.out.println("error");
        }
    }
    public synchronized void mostrarRegistro() {
        for(Map.Entry<TemaDeTesis,Date> entry: registro.entrySet()) {
            System.out.println(entry.getKey().getDatosDelEstudiante().getNombre()+" "+entry.getKey().getDatosDelEstudiante().getCi()+" "+entry.getKey().getTitulo()+" "+ entry.getKey().getMencion()+" "+entry.getValue());
        }
    }
}
