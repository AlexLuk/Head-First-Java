package Animals;

import java.util.ArrayList;

public class TestAnimals {
    public static void main(String[] args){
        Wolf w = new Wolf();
        w.makeNoise();
        w.roam();
        w.eat();
        w.sleep();

        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(new Cat());
        pets.add((new Dog()));
        pets.add((new RoboDog()));
        for (Pet p : pets){
            p.play();
        }
    }
}
