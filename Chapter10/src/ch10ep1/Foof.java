package ch10ep1;

public final class Foof {
    final int size = 3;
    final int whuffie;
    Foof(){
        whuffie=42;
    }
    void doStuff(final int x){
    }

    void doMore(){
        final int z=7;
    }

    final void calcWhuffie(){

    }
}

class TestFoof{
    public static void main(String[] args) {
        Foof f = new Foof();
        System.out.println(f.whuffie);
    }
}
