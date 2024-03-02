package at.codersbay.java.advanced.common.io.example_scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int maxInput = 5;

    public static void main(String[] args) {
        Scanner scanner = null;

        try {

            scanner = new Scanner(System.in);
            readInput(scanner, 1);

        } finally {
            System.out.println("Ich bin im finally Block.");
            if (scanner != null) {
                try {
                    scanner.close();
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
        }
    }

    public static void readInput(Scanner scanner, int loops) {
        System.out.println("Enter Number");

        String number = scanner.nextLine();

        String[] numbers = number.split(",");

        for (String tmpNumber : numbers) {

            try {
                int myNumber = Integer.parseInt(tmpNumber);
                System.out.println("Number is: " + myNumber);
            } catch (NumberFormatException nfe) {
                System.out.println("Sie haben keine Zahl eingegeben.");
            }
        }
        if (loops < maxInput) {
            loops += 1;
            readInput(scanner, loops);
        }
    }

}
