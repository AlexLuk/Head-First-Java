package Exercises;

/**
 * Created by Alexandr on 04.06.2017.
 */
public class Dragon extends Monster {
    @Override
    boolean frighten(int d) {
        System.out.println("Fire breath");
        return true;
    }
}
