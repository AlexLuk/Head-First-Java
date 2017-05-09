import java.util.Date;

/**
 * Created by Comp on 07.04.2017.
 */
public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new   Dog();
        one.setSize(70);
        Dog two = new   Dog();
        two.setSize(8);
        Dog three = new   Dog();
        three.setSize(35);
        Dog four;
        Dog five = new Dog();

        one.bark();
        two.bark();
        three.bark();
        five.setSize(one.getSize());

        if(one.equals(five)){
            System.out.println("Fife is equal to one");
        }
        else
        {
            System.out.println("Fife is not equal to one");
        }
    }
}
