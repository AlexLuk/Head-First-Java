/**
 * Created by Alexandr on 21.02.2017.
 */
public class Dog {
    int size;
    String name;
    void bark(){
        if(size>60){
            System.out.println("Gav! Gav!");
        }
        else if (size>14){
            System.out.println("Wuf! Wuf!");
        }
        else{
            System.out.println("Tuf, tuf!");

        }
    }
}
