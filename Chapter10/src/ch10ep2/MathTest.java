package ch10ep2;

public class MathTest {
    public static void main(String[] args) {
        double r1 = Math.random();
        int r2 = (int) Math.random();

        int x = Math.abs(123);
        double d = Math.abs(234.2);

        int y = Math.round(234.24f);
        System.out.println(y);
        y = Math.round(234.48f);
        System.out.println(y);
        y = Math.round(234.49f);
        System.out.println(y);
        y = Math.round(234.50f);
        System.out.println(y);
        y = Math.round(234.51f);
        System.out.println(y);

        y=Math.min(2,24);

        y=Math.max(3,45);
   }
}
