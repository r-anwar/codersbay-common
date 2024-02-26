package at.codersbay.java.advanced.exercises.library;

import java.util.LinkedList;
import java.util.List;

public class BookManagementSystem {

    private List<Book> books = new LinkedList<>();

    public BookManagementSystem() {

    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    //nach Büchern anhand derer Titel oder ISBN oder dem Vor- und Nachnamen des Autors gesucht werden können.

    public List<Book> search(String title, String ISBN, String authorFirstName, String authorLastName ) {
        /**
         * if ISBN is given, then List of Books has one or zero entry.
         */

        throw new RuntimeException("not yet implemented ;-)");
    }
}
