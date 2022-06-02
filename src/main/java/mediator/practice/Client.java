package mediator.practice;

public class Client {
    public static void main(String[] args) {
        Skype skypeUPB=new Skype();
        Profesional sm1 = new Profesional(skypeUPB);
        sm1.setTipo("certificaciones");
        sm1.setName("Gabriel");
        sm1.setCi("1423546");
        Profesional sm2 = new Profesional(skypeUPB);
        sm2.setTipo("certificaciones");
        sm2.setName("Miguel");
        sm2.setCi("54635");
        Profesional sm3 = new Profesional(skypeUPB);
        sm3.setTipo("certificaciones");
        sm3.setName("Richard");
        sm3.setCi("6758568");

        Profesional dev1 = new Profesional(skypeUPB);
        dev1.setTipo("lenguaje");
        dev1.setName("Marcos");
        dev1.setCi("123");
        Profesional dev2 = new Profesional(skypeUPB);
        dev2.setTipo("lenguaje");
        dev2.setName("Joamy");
        dev2.setCi("456");
        Profesional dev3 = new Profesional(skypeUPB);
        dev3.setTipo("lenguaje");
        dev3.setName("Dylan");
        dev3.setCi("7890");

        Profesional qa1 = new Profesional(skypeUPB);
        qa1.setTipo("gradoQA");
        qa1.setName("Ariane");
        qa1.setCi("111111");
        Profesional qa2 = new Profesional(skypeUPB);
        qa2.setTipo("gradoQA");
        qa2.setName("Camila");
        qa2.setCi("22222");
        Profesional qa3 = new Profesional(skypeUPB);
        qa3.setTipo("gradoQA");
        qa3.setName("Xime");
        qa3.setCi("33333333");
        skypeUPB.addToChat(sm1);
        skypeUPB.addToChat(sm2);
        skypeUPB.addToChat(sm3);
        skypeUPB.addToChat(dev1);
        skypeUPB.addToChat(dev2);
        skypeUPB.addToChat(dev3);
        skypeUPB.addToChat(qa1);
        skypeUPB.addToChat(qa2);
        skypeUPB.addToChat(qa3);

        sm1.send("esto es para todos");
        sm2.send("esto tambien es para todos");
        sm3.send("esto mas solo por el caso de todos");
        dev1.send("esto es para el dev2 y dev3");
        dev2.send("esto es para el dev1 y dev3");
        dev3.send("esto es para el dev2 y dev1");
        qa1.send("error encontrado, verificar qa3,qa2");
        qa2.send("error encontrado, verificar qa1,qa3");
        qa3.send("error encontrado, verificar qa1,qa2");
    }
}
