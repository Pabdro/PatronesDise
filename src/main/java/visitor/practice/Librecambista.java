package visitor.practice;

public class Librecambista implements ICambio{
    @Override
    public void cambio(Bolivia bolivia) {
        if(bolivia.getName().equals("boliviano")){
            double cambio= bolivia.getCambio() / 6.96;
            System.out.println(bolivia.getCambio() + " Bs a dolares es " + cambio + " $us");
        } else if(bolivia.getName().equals("dolar")) {
            double cambio= bolivia.getCambio() * 6.96;
            System.out.println(bolivia.getCambio() + " dolares a Bs es " + cambio + " Bs");
        }
    }

    @Override
    public void cambio(Argentina argentina) {
        if(argentina.getName().equals("peso")){
            double cambio= argentina.getCambio() * 0.0081;
            System.out.println(argentina.getCambio() + " ARS a dolares es " + cambio + " $us");
        } else if(argentina.getName().equals("dolar")) {
            double cambio= argentina.getCambio() / 0.0081;
            System.out.println(argentina.getCambio() + " dolares a ARS es " + cambio + " ARS");
        }
    }

    @Override
    public void cambio(Brasil brasil) {
        if(brasil.getName().equals("real")){
            double cambio= brasil.getCambio() * 0.19;
            System.out.println(brasil.getCambio() + " Rs a dolares es " + cambio + " $us");
        } else if(brasil.getName().equals("dolar")) {
            double cambio= brasil.getCambio() / 0.19;
            System.out.println(brasil.getCambio() + " dolares a Rs es " + cambio + " Rs");
        }
    }

    @Override
    public void cambio(Italia italia) {
        if(italia.getName().equals("euro")){
            double cambio= italia.getCambio() * 1.05;
            System.out.println(italia.getCambio() + " euro a dolares es " + cambio + " $us");
        } else if(italia.getName().equals("dolar")) {
            double cambio= italia.getCambio() / 1.05;
            System.out.println(italia.getCambio() + " dolares a euro es " + cambio + " euro");
        }
    }
}
