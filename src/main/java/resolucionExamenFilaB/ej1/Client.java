package resolucionExamenFilaB.ej1;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        JefeRU jefeRU  = new JefeRU();
        TemaDeTesis tema1 = new TemaDeTesis();
        TemaDeTesis tema2 = new TemaDeTesis();
        TemaDeTesis tema3 = new TemaDeTesis();
        TemaDeTesis tema4 = new TemaDeTesis();

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Miguel");
        estudiante1.setCi("23478647");
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Gabriel");
        estudiante2.setCi("3425245234");
        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Richard");
        estudiante3.setCi("32452345");
        Estudiante estudiante4 = new Estudiante();
        estudiante4.setNombre("Marcos");
        estudiante4.setCi("656262345");

        tema1.setTitulo("Ing Petrolero");
        tema1.setMencion("Petroleo");
        tema1.setDatosDelEstudiante(estudiante1);

        tema2.setTitulo("Ing Biomedica");
        tema2.setMencion("Protesis");
        tema2.setDatosDelEstudiante(estudiante2);

        tema3.setTitulo("Admin empresas");
        tema3.setMencion("Banco");
        tema3.setDatosDelEstudiante(estudiante3);

        tema4.setTitulo("Ing Sistemas");
        tema4.setMencion("Computadoras");
        tema4.setDatosDelEstudiante(estudiante4);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                jefeRU.registrarTesis(tema1, new Date());
                jefeRU.mostrarDatosRegistro();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                jefeRU.registrarTesis(tema2, new Date());
                jefeRU.mostrarDatosRegistro();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                jefeRU.registrarTesis(tema3, new Date());
                jefeRU.mostrarDatosRegistro();
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                jefeRU.registrarTesis(tema4, new Date());
                jefeRU.mostrarDatosRegistro();
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                jefeRU.registrarTesis(tema1, new Date());
                jefeRU.mostrarDatosRegistro();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
