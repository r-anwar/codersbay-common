package at.codersbay.java.advanced.common.exercises.bmi;

public class Main {

    public static void main(String[] args) {

        Person person = new Person(173, 90, 0);

        person.bmiBerechnen();

        person.bmiAusgeben();

        Person person2 = new Person(193, 90, 0);

        person2.bmiBerechnen();

        person2.bmiAusgeben();

    }
}
