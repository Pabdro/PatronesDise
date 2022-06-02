package mediator.practice;

public abstract class Persona {
    protected ICanalComunicacion canalComunication;
    private String name;
    private String ci;
    private String tipo;
    public Persona(ICanalComunicacion canalComunication){
        this.canalComunication=canalComunication;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }
    public abstract void send(String msg);
    public abstract void received(String msg);
}
