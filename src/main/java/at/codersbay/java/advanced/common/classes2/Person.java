package at.codersbay.java.advanced.common.classes2;

public class Person {

    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void ausgabe() {
        System.out.println(getFirstName());
        System.out.println(getLastName());
    }
}
