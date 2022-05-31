package iterator.practice;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Importadora1 imp1 = new Importadora1();
        imp1.add(new Auto(31200,"TOYOTA",4, "4*4"));

        Importadora2 imp2 = new Importadora2();
        imp2.add(new Auto(23400,"NISSAN",4, "4*4"));

        Importadora3 imp3 = new Importadora3();
        imp3.add(new Auto(12400,"SUZUKI",4, "4*4"));

        Importadora4 imp4 = new Importadora4();
        imp4.add(new Auto(56700,"MITSUBISHI",4, "4*4"));

        Iterator iterator;
        Map<Auto, String> map = new HashMap<Auto, String>();

        iterator = imp1.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto, auto.getModelo());
        }

        iterator = imp2.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto, auto.getModelo());
        }

        iterator = imp3.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto, auto.getModelo());
        }

        iterator = imp4.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto, auto.getModelo());
        }

        for (Auto key : map.keySet()) {
            System.out.println("Auto: "+key.getCosto()+" "+key.getModelo()+" "+key.getNroDeAsientos()+" "+key.getTipo());
        }

    }
}
