

import java.util.ArrayList;

/**
 * Created by Comp on 05.06.2017.
 */
public class TestObject {
    public static void main(String[] args) {
        Object ob = new Object();
        System.out.println(ob.getClass());

        ArrayList<Object> myObList = new ArrayList<Object>();
        myObList.add("HellO!");
        if (myObList.get(0).getClass()==java.lang.String.class) {
            String st = String.valueOf(myObList.get(0));
            System.out.println(st);
        }
    }
}
