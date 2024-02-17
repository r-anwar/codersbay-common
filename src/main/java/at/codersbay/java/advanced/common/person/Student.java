package at.codersbay.java.advanced.common.person;

public class Student extends Person {

    int matrikelnummer;


    void ausgabe() {
        System.out.println("firstName: " + firstName
                + "; lastName" + lastName + "; matrikelnummer" + matrikelnummer);
    }
}
