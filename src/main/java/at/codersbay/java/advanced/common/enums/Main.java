package at.codersbay.java.advanced.common.enums;

public class Main {

    enum Farben {
        ROT, GELB, GRÜN, BLAU;
    }

    enum POWER_STATE {
        ON, OFF;
    }

    enum WEEK_DAY {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }


    public static void main(String[] args) {
        System.out.println(Farben.BLAU);
        System.out.println(Farben.ROT);
        System.out.println(Farben.GRÜN);

        Farben meineFarbe = Farben.ROT;
        System.out.println(meineFarbe);

        POWER_STATE televisionState = POWER_STATE.ON;
        System.out.println(televisionState);


        televisionState = POWER_STATE.OFF;
        System.out.println(televisionState);

    }
}
