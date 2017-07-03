package ch9ex3;

import java.util.ArrayList;

public class TestLifeSupportSim {
    public static void main(String[] args) {
        ArrayList<SimUnit> arrayList = new ArrayList();
        V2Radiator v2 = new V2Radiator(arrayList);
        System.out.println("V2Radiator added");
        getPowerUse(arrayList);
        V3Radiator v3 = new V3Radiator(arrayList);
        System.out.println("V3Radiator added");
        getPowerUse(arrayList);
        for (int i = 0; i < 20; i++) {
            RetentionBot ret = new RetentionBot(arrayList);
        }
        System.out.println("RetentionBots added");
        getPowerUse(arrayList);
    }

    private static int getPowerUse(ArrayList<SimUnit> arrayList) {
        int totalPowerUse=0;
        for (SimUnit sim : arrayList){
            totalPowerUse += sim.powerUse();
        }
        System.out.println(totalPowerUse);
        return totalPowerUse;
    }
}

