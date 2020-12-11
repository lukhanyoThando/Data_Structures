package Data_structures;

import java.util.Collection;
import java.util.TreeSet;

public class CollectionInterfaceImp {
    static Collection<Integer> collection = new TreeSet<>();

    public String addElements(int num) {

        collection.add(num);
        return collection.toString();
    }

}
