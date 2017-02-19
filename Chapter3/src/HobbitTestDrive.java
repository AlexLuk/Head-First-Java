/**
 * Created by Alexandr on 20.02.2017.
 */
public class HobbitTestDrive {
    public static void main(String[] args) {
        Hobbit[] h=new Hobbit[3];
        int z=0;
        while(z<3){
            h[z]=new Hobbit();
            h[z].name="Bilbo";
            if(z==1) {
                h[z].name = "Frodo";
            }
            if(z==2){
                h[z].name="Sam";
            }
            System.out.println("Hobbit name: "+h[z].name);
            z=z+1;
        }
    }
}
