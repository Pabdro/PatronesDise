package chainResponsability.practice.ejrchainOfResponsability;

public class Client {
    public static void main(String[] args) {
        ArrHandler arr= new ArrHandler();
        Personas[] personas=new Personas[11];

        personas[0] = new Personas(123, "Gabriel", 12);
        personas[1] = new Personas(234, "Ariane", 19);
        personas[2] = new Personas(345, "Richard", 13);
        personas[3] = new Personas(456, "Miguel", 11);
        personas[4] = new Personas(567, "Marcos", 15);
        personas[5] = new Personas(678, "Bustillosss", 18);
        personas[6] = new Personas(789, "Felipe", 22);
        personas[7] = new Personas(890, "Alejandra", 25);
        personas[8] = new Personas(987, "Jomy", 19);
        personas[9] = new Personas(876, "Diego", 21);
        personas[10] = new Personas(876, "Victor", 23);

        for(int i = 0; i<personas.length; i++){
            System.out.println("Datos: " + personas[i].getNombre() + ", " + personas[i].getEdad());
        }
        arr.criteriaHandler(personas);
        System.out.println();
        for(int i = 0; i<personas.length; i++){
            System.out.println("Datos ordenados: " + personas[i].getNombre() + ", " + personas[i].getEdad());
        }
    }
}
