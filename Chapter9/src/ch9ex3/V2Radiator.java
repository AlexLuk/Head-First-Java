package ch9ex3;

import java.util.ArrayList;

public class V2Radiator {
    public V2Radiator(ArrayList list) {
        for (int i = 0; i < 5; i++) {
            list.add(new SimUnit("V2Radiator"));
        }
    }
}
