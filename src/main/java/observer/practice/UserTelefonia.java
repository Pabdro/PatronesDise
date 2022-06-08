package observer.practice;

public class UserTelefonia implements IUser{
    String catalizador;
    Persona persona;

    public UserTelefonia(String notificacion, Persona persona) {
        this.catalizador = notificacion;
        this.persona = persona;
    }

    @Override
    public void update(String msg, Notificaciones newNotificaciones) {
        System.out.println("******* Notificacion: "+msg+" *****");
        System.out.println("persona: "+persona.getName());
        System.out.println("preferencia: "+ catalizador);
        newNotificaciones.showInfo();
    }

    @Override
    public void update2(String msg, Notificaciones newNotificaciones) {
        System.out.println("******* Notificacion: "+msg+" *****");
        System.out.println("persona: "+persona.getName());
        System.out.println("preferencia: "+ catalizador);
        newNotificaciones.showInfo2();
    }

    @Override
    public void update3(String msg, Notificaciones newNotificaciones) {
        System.out.println("******* Notificacion: "+msg+" *****");
        System.out.println("persona: "+persona.getName());
        System.out.println("preferencia: "+ catalizador);
        newNotificaciones.showInfo3();
    }

    @Override
    public String getPreferenciaNotificaciones() {
        return catalizador;
    }

    public Persona getPersona() {
        return persona;
    }
}
