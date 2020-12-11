package Data_structures;

import org.junit.Assert;
import org.junit.Test;

public class TestInterfaces {


    @Test
    public void addElements() {
        CollectionInterfaceImp collectionInterfaceImp = new CollectionInterfaceImp();

        collectionInterfaceImp.addElements(8);
        collectionInterfaceImp.addElements(2);
        collectionInterfaceImp.addElements(40);


        String treeSet = collectionInterfaceImp.addElements(20);


        Assert.assertEquals(treeSet, "[2, 8, 20, 40]");
    }


    @Test
    public void checkExistence(){
        ListInterfaceImp listInt = new ListInterfaceImp();
        listInt.addToStack(50);
        listInt.removeTop();

        boolean existence = listInt.checkExistence(50);
        Assert.assertFalse(existence);
    }


    @Test
    public void isEmpty(){
        SetInterfaceImp setInterfaceImp = new SetInterfaceImp();
        setInterfaceImp.add();
        setInterfaceImp.deleteAll();

        boolean isEmpty = setInterfaceImp.isEmpty();

        Assert.assertTrue(isEmpty);
    }

    @Test
    public void checkHighestMark(){
        MapInterfaceImp map = new MapInterfaceImp();
        map.addStudents();
        int max = map.getHighestGrade();

        Assert.assertEquals(max, 95);
    }
}