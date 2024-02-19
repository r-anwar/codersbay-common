package at.codersbay.java.advanced.common.classes2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * - Personen (Vornamen, Nachnamen, Gehalt)
         * - Mitarbeiter (Fachkompetenz: programmieren)
         * - Chefs ( Liste<Mitarbeiter> für die er verantwortlich ist.)
         *
         *
         * Alles in der Main-Klasse zusammen führen.
         */

        Chef chef = new Chef();
        chef.setFirstName("Max");
        chef.setLastName("Mustermann");
        chef.setMitarbeiter(new ArrayList<>(5));

        Mitarbeiter mitarbeiter1 = new Mitarbeiter();
        mitarbeiter1.setFirstName("Gerhard");
        mitarbeiter1.setLastName("Berger");
        chef.getMitarbeiter().add(mitarbeiter1);

        Mitarbeiter mitarbeiter2 = new Mitarbeiter();
        mitarbeiter2.setFirstName("Dorian");
        mitarbeiter2.setLastName("Müller");
        chef.getMitarbeiter().add(mitarbeiter2);


        Mitarbeiter mitarbeiter3 = new Mitarbeiter();
        mitarbeiter3.setFirstName("Elisabeth");
        mitarbeiter3.setLastName("Schwarz");
        mitarbeiter3.setLastName("Schwarz");
        chef.getMitarbeiter().add(mitarbeiter1);

        chef.augabe();
    }
}
