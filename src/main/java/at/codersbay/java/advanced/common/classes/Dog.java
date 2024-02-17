package at.codersbay.java.advanced.common.classes;

/**
 * Dog ist ein Child von Animal, und Animal ist ein parent von Dog.
 */
public class Dog extends Animal {

    int pfoten = 4;

    void run(String name) {
        System.out.println(name + ": I'm running on my 4 Pfoten...");
    }

    void ausgabe() {
        System.out.println("alter: " + age);
        System.out.println("pfoten: " + pfoten);
    }
}
