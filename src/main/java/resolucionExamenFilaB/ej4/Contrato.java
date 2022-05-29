package resolucionExamenFilaB.ej4;

public class Contrato {
    private String costo;
    private String empresa;
    private String listaDeCanales;
    public Contrato(){}

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getListaDeCanales() {
        return listaDeCanales;
    }

    public void setListaDeCanales(String listaDeCanales) {
        this.listaDeCanales = listaDeCanales;
    }
    public void showInfo(){
        System.out.println("costo="+costo);
        System.out.println("empresa="+empresa);
        System.out.println("lista de canales="+listaDeCanales);
        System.out.println();
    }
}
