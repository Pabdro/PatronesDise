package memento.practice;

import java.util.HashMap;
import java.util.Map;

public class Caretakerbdd {
    private Map<String, Memento> stateList = new HashMap<>();

    public void addMemento(String alias, Memento m){
        stateList.put(alias, m);
    }
    public Memento getMemento(String alias){
        return stateList.get(alias);
    }
}
