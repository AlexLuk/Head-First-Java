/**
 * Created by Comp on 07.04.2017.
 */
public class Dog {
    int size;
    String name;

    void bark(){
        if(size>60){
            System.out.println("Huf-Huf");
        }
        else if(size>14){
            System.out.println("Wuf-Wuf");

        }
        else{
            System.out.println("Wif-Wif");
        }
    }
}
