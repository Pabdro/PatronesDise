package chainResponsability.practice;


public class ManagerHandler implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        SegipCarnet resp1= new SegipCarnet();
        this.setNext(resp1);

        AtencionCliente resp2 = new AtencionCliente();
        resp1.setNext(resp2);

        OrgFichas resp3 = new OrgFichas();
        resp2.setNext(resp3);

        Notario respFinal = new Notario();
        resp3.setNext(respFinal);

        CajeroBanco respFinal2 = new CajeroBanco();
        respFinal.setNext(respFinal2);

        this.next.criteriaHandler(persona);
    }

    @Override
    public IHandler next() {
        return next;
    }
}
