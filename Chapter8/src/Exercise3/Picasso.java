package Exercise3;

public abstract class Picasso implements Nose{
    @Override
    public int iMethod() {
        return 7;
    }
}

interface Nose{
    public int iMethod();
}

class Acts extends Picasso{
    @Override
    public int iMethod() {
        return 5;
    }
}

class Clowns extends Picasso{}
