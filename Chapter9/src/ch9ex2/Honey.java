package ch9ex2;

public class Honey {
    public static void main(String[] args) {
        Honey honeyPot = new Honey(); //1
        Honey[] ha= {honeyPot,honeyPot,honeyPot,honeyPot}; //4
        Bees b1 = new Bees();
        b1.beeHA=ha; //4
        Bear[] ba = new Bear[5];
        for (int i = 0; i < 5; i++) {
            ba[i]=new Bear();
            ba[i].hunny=honeyPot; //5
        }

        Kit k = new Kit();
        k.kh=honeyPot; //1
        Raccoon r = new Raccoon();

        r.rh = honeyPot; //1
        r.k=k; //1
        k=null; // -1
    }
}
