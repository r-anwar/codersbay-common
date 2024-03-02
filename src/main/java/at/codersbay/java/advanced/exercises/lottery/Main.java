package at.codersbay.java.advanced.exercises.lottery;

import java.util.*;

/**
 * Erstellen Sie das Spiel Lotto 6 aus 45.
 * <p>
 * Lesen Sie 6 Zahlen aus kommasepariert über die Kommandozeile ein. Losen Sie mittels der Klasse
 * java.util.Random 6 Zahlen aus 45 aus. Geben Sie das Ergebnis über die Kommandozeile aus,
 * des Weiteren ob der Benutzer einen Gewinn erzielt hat oder nicht.
 * <p>
 * Folgende Gewinnklassen gibt es.
 * - 3 gleiche Zahlen
 * - 4 gleiche Zahlen
 * - 5 gleiche Zahlen
 * - 6 gleiche Zahlen
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = null;

        int[] userNumbers = {0, 0, 0, 0, 0, 0};

        try {
            scanner = new Scanner(System.in);

            System.out.println("Bitte geben Sie 6 Zahlen zwischen 1 und 45 komma separiert ein: z.B. 1,2,3,4,5,6");

            userNumbers = readInput(scanner);

        } catch (Throwable t) {
            System.out.println("Folgender Fehler ist aufgetreten: " + t.getMessage());
        } finally {
            if (scanner != null) {
                try {
                    scanner.close();
                } catch (Throwable t) {
                    System.out.println("Scanner konnte nicht geschloßen werden.");
                }
            }
        }

        int[] lotteryNumbers = new int[6];
        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = getLotteryNumber(lotteryNumbers);
        }


        Arrays.sort(lotteryNumbers);
        System.out.println("Die gezogenen Zahlen lauten: ");
        for(int lotteryNumber: lotteryNumbers) {
            System.out.print(lotteryNumber + " ");
        }

        List<Integer> matchedNumbers = new LinkedList<>();

        for (int userNumber : userNumbers) {
            for (int lotteryNumber : lotteryNumbers) {
                if (userNumber == lotteryNumber) {
                    matchedNumbers.add(userNumber);
                }
            }
        }

        if(matchedNumbers.size() > 0) {
            System.out.println("\nSie haben folgende Nummern richtig.");

            for (int matchedNumber : matchedNumbers) {
                System.out.print(matchedNumber + " ");
            }
        } else {
            System.out.println("\nSie haben keine Nummern richtig.");
        }
    }

    /**
     * Rekursiver Methodenaufruf studieren.
     * @param lotteryNumbers
     * @return
     */
    public static int getLotteryNumber(int[] lotteryNumbers) {

        Random random = new Random();

        int randomNumber = random.nextInt(1, 46);

        for (int lotteryNumber : lotteryNumbers) {
            if (randomNumber == lotteryNumber) {
                randomNumber = getLotteryNumber(lotteryNumbers);
            }
        }

        return randomNumber;
    }

    public void helloWorld(int count) {
        if(count < 10) {
            helloWorld(count++);
        }
    }


    public static int[] readInput(Scanner scanner) {
        int[] returnValue = new int[6];

        String userInput = scanner.nextLine();

        try {
            String[] userNumbers = userInput.split(",");

            if (userNumbers.length != 6) {
                System.out.println("Bitte geben Sie genau 6 Zahlen komma separiert ein.");
                readInput(scanner);
            }

            for (int i = 0; i < userNumbers.length; i++) {
                int parsedNumber = Integer.parseInt(userNumbers[i]);

                for (int value : returnValue) {
                    if (parsedNumber == value) {
                        System.out.println("Bitte geben Sie keine Dubletten ein.");
                        readInput(scanner);
                    }
                }

                if (parsedNumber < 1 || parsedNumber > 45) {
                    System.out.println("Bitte geben Sie Zahlen zwischen 1 und 45 an.");
                    readInput(scanner);
                }

                returnValue[i] = parsedNumber;
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Bitte geben Sie ausschließlich Zahlen an.");
            readInput(scanner);
        } catch (Throwable t) {
            readInput(scanner);
        }

        return returnValue;
    }
}
