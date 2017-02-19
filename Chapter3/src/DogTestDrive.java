/**
 * Created by Alexandr on 20.02.2017.
 */
public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.name="Fred";
        dog1.bark();

        Dog[] myDogs = new Dog[3];
        myDogs[0]=new  Dog();
        myDogs[1]=new  Dog();
        myDogs[2]=new  Dog();

        myDogs[0].name="Sam";
        myDogs[1].name="Jord";
        System.out.println(myDogs[2].name);
        myDogs[2]=dog1;

        int x=0;
        while (x<myDogs.length){
            myDogs[x].bark();
            x=x+1;
        }
    }
}
