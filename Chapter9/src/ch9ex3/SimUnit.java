package ch9ex3;

public class SimUnit {
    String botType;

    public SimUnit(String botType) {
        this.botType = botType;
    }

    public int powerUse() {
        if ("HeatMachin".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
}
