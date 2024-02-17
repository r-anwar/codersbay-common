package at.codersbay.java.advanced.common.person;

public class Professor extends Person {

    String title;

    void ausgabe() {
        System.out.println("title: " + title + "; firstName: " + firstName
                + "; lastName" + lastName);
    }
}
