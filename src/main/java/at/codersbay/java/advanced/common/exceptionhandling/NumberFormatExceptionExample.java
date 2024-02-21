package at.codersbay.java.advanced.common.exceptionhandling;

public class NumberFormatExceptionExample {


    public static void main(String[] args) {

        Integer test = null;

        try {
            test = Integer.parseInt("10");
        } catch(NumberFormatException nfe) {
            System.out.println("Upps Fehler");
        }
    }
}
