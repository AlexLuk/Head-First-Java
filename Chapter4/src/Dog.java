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

    void bark(int numOfBarks){
        while(numOfBarks>0){
            bark();
            numOfBarks=numOfBarks-1;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
