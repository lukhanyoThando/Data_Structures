package Data_structures;

import java.util.Stack;
import java.util.List;

public class ListInterfaceImp {
    static List<Integer> list = new Stack<>();
    int i = -1;

    public void addToStack(int num){
        list.add(num);
        i++;
    }

    public int getTop(){
        return list.get(i);
    }

    public void removeTop() {
        list.remove(i);
    }

    public boolean checkExistence(int num){
        boolean exist = false;

        if (list.contains(num))
            exist = true;

        return exist;
    }

}
