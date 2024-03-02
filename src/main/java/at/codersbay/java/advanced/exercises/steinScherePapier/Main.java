package at.codersbay.java.advanced.exercises.steinScherePapier;

import java.util.Random;
import java.util.Scanner;
/**
 * Schreiben Sie ein Programm welches das ein Spiel "Stein, Schere, Papier" simuliert.
 * <p>
 * Schritte: *
 * Definieren Sie ein enum-Typ mit den Namen Wahl und den drei Werten STEIN, SCHERE und PAPIER.
 * Implementieren Sie die Spiellogik in einer Methode spielRunde(Wahl benutzerWahl),
 * die die Wahl des Benutzers und des Computers vergleicht und den Gewinner bestimmt.
 * Verwenden Sie die Scanner-Klasse, um die Wahl des Benutzers einzugeben.
 * Generieren Sie die Wahl des Computers zufällig mittels der Klasse java.util.Random
 * Geben Sie das Ergebnis der Spielrunde und den Gewinner aus.
 *
 */
public class Main {

    enum Wahl {
        STEIN,
        SCHERE,
        PAPIER
    }

    public static void main(String[] args) {
        // Spielrunde starten
        spielRunde(benutzerWahl());
    }

    // Methode zum Einlesen der Wahl des Benutzers
    private static Wahl benutzerWahl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib deine Wahl ein (Stein, Schere, Papier):");
        String eingabe = scanner.nextLine().toUpperCase();

        if(!eingabe.equals(Wahl.PAPIER.name()) && !eingabe.equals(Wahl.SCHERE.name())
                && !eingabe.equals(Wahl.STEIN.name())) {
            return benutzerWahl();
        }
        return Wahl.valueOf(eingabe);
    }

    // Methode zum Spielen einer Runde
    private static void spielRunde(Wahl benutzerWahl) {
        Random random = new Random();
        Wahl computerWahl = Wahl.values()[random.nextInt(Wahl.values().length)];

        System.out.println("Du hast " + benutzerWahl + " gewählt.");
        System.out.println("Der Computer hat " + computerWahl + " gewählt.");

        // Spiellogik
        if (benutzerWahl == computerWahl) {
            System.out.println("Unentschieden!");
        } else if ((benutzerWahl == Wahl.STEIN && computerWahl == Wahl.SCHERE) ||
                (benutzerWahl == Wahl.SCHERE && computerWahl == Wahl.PAPIER) ||
                (benutzerWahl == Wahl.PAPIER && computerWahl == Wahl.STEIN)) {
            System.out.println("Du hast gewonnen!");
        } else {
            System.out.println("Der Computer hat gewonnen!");
        }
    }
}
