/**
 * Created by Comp on 07.04.2017.
 */
public class Dog {
    private int size;

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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
