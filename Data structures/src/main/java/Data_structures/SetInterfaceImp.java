package Data_structures;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceImp{
    static Set<String> set = new HashSet<>();

    public void add(){
        set.add("A");
        set.add("Z");
    }

    public void deleteAll(){
        set.clear();
    }

    public boolean isEmpty(){
        return set.isEmpty();
    }
}
