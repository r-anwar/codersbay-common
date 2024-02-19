package at.codersbay.java.advanced.common.classes2;

public class Mitarbeiter extends Person {

    private String fachkompetenz;

    public String getFachkompetenz() {
        return fachkompetenz;
    }

    public void setFachkompetenz(String fachkompetenz) {
        this.fachkompetenz = fachkompetenz;
    }

    public void ausgabe() {
        System.out.println(getFachkompetenz());
    }
}
