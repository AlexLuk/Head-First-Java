import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Comp on 31.05.2017.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<Integer>();
        Integer[] myList2=new Integer[2];
        Integer a = new Integer(1);
        Integer b = new Integer(2);
        myList.add(a);
        myList.add(b);
        myList2[0]=a;
        myList2[1]=b;
        System.out.println(myList.size());
        int l = myList2.length;

        Object o = myList.get(1);
        Object o2 = myList2[0];
        System.out.println(myList.contains(b));
        boolean isIn2=false;
        for (int i = 0; i < myList2.length; i++) {
           if(myList2[i]==b){
               isIn2=true;
               break;
           }
        }

        System.out.println(myList.indexOf(2));
        System.out.println(myList.isEmpty());
        System.out.println(myList.remove(1));
        myList2[0]=null;
        System.out.println(myList.indexOf(2));
    }

}
