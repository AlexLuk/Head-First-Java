package ch9ex3;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("t1");
        s.add("t2");
        s.add("t3");
        s.add("t4");
        for (String ss : s) {
            System.out.println(ss);

        }

    }
}
