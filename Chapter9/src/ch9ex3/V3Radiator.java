package ch9ex3;

import java.util.ArrayList;

public class V3Radiator extends V2Radiator {
    public V3Radiator(ArrayList list) {
        super(list);
        for (int i = 0; i < 10; i++) {
            list.add(new SimUnit("V3Radiator"));
        }
    }
}

