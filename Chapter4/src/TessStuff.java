/**
 * Created by Comp on 29.05.2017.
 */
public class TessStuff {
    void  testTwo(int a, int b){
        System.out.println(a+b);
    }

    void testMany(int a, int[] b){
        int summ=a;
        for (int i = 0; i < b.length; i++) {
            summ=summ+b[i];
        }
        System.out.println(summ);
    }

    void testManyparams(int... a){
        testMany(0,a);
    }
}
