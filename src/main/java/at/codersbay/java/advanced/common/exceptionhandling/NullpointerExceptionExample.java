package at.codersbay.java.advanced.common.exceptionhandling;

public class NullpointerExceptionExample {


    public static void main(String[] args) {


        String test = null;

        // folgende wirft NullpointerException
        test = test.toLowerCase();

        /**
         * mögliche Lösung entweder if null Abfrage oder try-catch Statement
         */

        if(test != null) {
            test = test.toLowerCase();
        }

        try {
            test = test.toLowerCase();
        } catch(NullPointerException npe) {
            System.out.println("die Variable test hat den Wert null.");
        }
    }
}
