package at.codersbay.java.advanced.common.exceptionhandling;

public class NullpointerExceptionExample {


    public static void main(String[] args) {

        String test = null;

        try {
            test = test.toLowerCase();
        } catch(NullPointerException npe) {
            System.out.println("die Variable test hat den Wert null.");
        }
    }
}
