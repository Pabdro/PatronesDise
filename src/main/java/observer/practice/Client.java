package observer.practice;

public class Client {
    public static void main(String[] args) {
        CanalTelefonia canalTelefonia=new CanalTelefonia();
        canalTelefonia.attach(new UserTelefonia("premiosPromos",new Persona("12312312","Felipe")));
        canalTelefonia.attach(new UserTelefonia("noticia",new Persona("34534676","Victor")));
        canalTelefonia.attach(new UserTelefonia("todos",new Persona("98676564","Sebas")));

        canalTelefonia.noti(new Notificaciones("234","descuentos","casas", "hoy llueve", "todos"));

    }
}
