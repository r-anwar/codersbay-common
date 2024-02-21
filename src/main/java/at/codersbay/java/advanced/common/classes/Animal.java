package at.codersbay.java.advanced.common.classes;

public class Animal {

    int age;


    void run(String name) {
        System.out.println(name + ": I do not know what to do...");
    }

    void ausgabe() {
        System.out.println("alter: " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
