package ch9ex1;

public class GC {
    public static GC doStuff() {
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void doStuff2(GC copyGC) {
        GC localGC;
    }

    public static void main(String[] args) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();

//        1
//        2
        gc2=null;
//        3
//        4
        gc1=null;
//        5
//        6
//        7
//        8
        gc1=gc4;
//        9

    }
}

