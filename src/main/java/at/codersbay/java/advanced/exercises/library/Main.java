package at.codersbay.java.advanced.exercises.library;

import java.util.LinkedList;
import java.util.List;

/**
 * Erstelle ein Buchverwaltungssystem.
 * Das Buchverwaltungssystem soll eine Liste von Bücher halten, des Weiteren soll
 * nach Büchern anhand derer Titel oder ISBN oder dem Vor- und Nachnamen des Autors gesucht werden können.
 * Bücher sollen ausgeliehen und zurückgegeben werden können, sind die Bücher ausgeliehen so darf das Buch kein weiteres
 * mal ausgeliehen werden.
 *
 * Ein Buch hat unter anderen(!) folgende Attribute (Titel, ISBN, Autor-Objekt)
 * Ein Autor besteht aus folgenden Attributen (Vorname, Nachname, Liste von Büchern)
 *
 *
 * Erstellen Sie mindestens 5 Bücher, mindestens 2 Bücher sollen denselben Autor haben. Suchen Sie nach mindestens
 * 2 Büchern, leihen Sie mindestens 2 Bücher aus, versuchen Sie ein ausgeliehenes Buch auszuleihen und geben Sie diese
 * auch wieder zurück.
 *
 */
public class Main {


    public static void main(String[] args) {

        // do data input, like:
        BookManagementSystem system = new BookManagementSystem();

        Book siddhartha = new Book("Siddhartha", "ISBN1234567890", null);
        Book steppenWolf = new Book("Der Steppenwolf", "ISBN09876543221", null);

        List<Book> hesseBooks = new LinkedList();
        hesseBooks.add(siddhartha);
        hesseBooks.add(steppenWolf);

        Author hesse = new Author("Hermann", "Hesse", hesseBooks);
        siddhartha.setAuthor(hesse);
        steppenWolf.setAuthor(hesse);

        List<Book> systemBooks = system.getBooks();
        systemBooks.addAll(hesseBooks);

        List<Book> found = system.search("", "ISBN1234567890", "Albert", "Hesse");

        System.out.println("Search, found: " + found.size() + " books.");


        if(system.borrow(siddhartha)) {
            System.out.println("Das Buch " + siddhartha.getTitle() + " ist nun ausgeliehen.");
        } else {
            System.out.println("Das Buch " + siddhartha.getTitle() + " ist bereits ausgeliehen.");
        }

        if(system.borrow(siddhartha)) {
            System.out.println("Das Buch " + siddhartha.getTitle() + " ist nun ausgeliehen.");
        } else {
            System.out.println("Das Buch " + siddhartha.getTitle() + " ist bereits ausgeliehen.");
        }

        system.returnBook(siddhartha);

        if(system.borrow(siddhartha)) {
            System.out.println("Das Buch " + siddhartha.getTitle() + " ist nun ausgeliehen.");
        } else {
            System.out.println("Das Buch " + siddhartha.getTitle() + " ist bereits ausgeliehen.");
        }
    }


}
