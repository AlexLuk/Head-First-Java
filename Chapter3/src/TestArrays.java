/**
 * Created by Alexandr on 21.02.2017.
 */
public class TestArrays {
    public static void main(String[] args) {

        String[] islands = new String[4];
        islands[0]="bermudes";
        islands[1]="fidji";
        islands[2]="azores";
        islands[3]="konsumel";

        int[] index = new int [4];
        index[0]=1;
        index[1]=3;
        index[2]=0;
        index[3]=2;

        int y=0;
        int ref;
        System.out.println("islands=");
        while (y<4) {
            ref = index[y];
            System.out.println(islands[ref]);
            y=y+1;
        }
    }
}

