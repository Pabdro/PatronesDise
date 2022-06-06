package chainResponsability.practice;

public class Client {
    public static void main(String[] args) {
        ManagerHandler managerHandler= new ManagerHandler();
        managerHandler.criteriaHandler(new Persona(false, false, true));
    }
}
