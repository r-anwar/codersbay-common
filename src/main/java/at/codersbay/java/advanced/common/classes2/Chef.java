package at.codersbay.java.advanced.common.classes2;

import java.util.List;

public class Chef extends Person {

    private List<Mitarbeiter> mitarbeiter;

    public List<Mitarbeiter> getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(List<Mitarbeiter> mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public void augabe() {

        System.out.println(getFirstName());
        System.out.println(getLastName());

        if(mitarbeiter != null) {

            for(Mitarbeiter tmpMitarbeiter: mitarbeiter) {
                System.out.println("############################");
                tmpMitarbeiter.ausgabe();
            }
        }
    }
}
