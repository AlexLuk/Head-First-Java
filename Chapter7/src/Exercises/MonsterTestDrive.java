package Exercises;

import java.util.ArrayList;

/**
 * Created by Alexandr on 04.06.2017.
 */
public class MonsterTestDrive {
    public static void main(String[] args) {
        ArrayList<Monster> ma = new ArrayList<>();
        ma.add(new Vampire());
        ma.add(new Dragon());
        ma.add(new Monster());
        for (int i = 0; i < 3; i++) {
            ma.get(i).frighten(i);
        }
    }
}
