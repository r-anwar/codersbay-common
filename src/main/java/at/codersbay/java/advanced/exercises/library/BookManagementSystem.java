package at.codersbay.java.advanced.exercises.library;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

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


    public boolean borrow(Book book) {
        if(book == null || book.isBorrowed()) {
            return false;
        }

        book.setBorrowed(true);
        return true;
    }

    public void returnBook(Book book) {
        if(book != null) {
            book.setBorrowed(false);
        }
    }

    public List<Book> search(String title, String ISBN, String authorFirstName, String authorLastName) {
        List<Book> result = new LinkedList<>();

        if (this.books.size() == 0) {
            return result;
        }

        /**
         * if ISBN is given then List of Books has one or zero entry.
         */

        if (ISBN != null && ISBN.trim().length() > 0) {
            for (Book book : this.books) {
                if (book == null || book.getISBN() == null || book.getISBN().trim().length() == 0) {
                    continue;
                }

                if (book.getISBN().equals(ISBN)) {
                    result.add(book);
                    break;
                }
            }

            return result;
        }

        if (title == null) {
            title = "";
        }

        if (authorFirstName == null) {
            authorFirstName = "";
        }

        if (authorLastName == null) {
            authorLastName = "";

        }

        for (Book book : books) {
            if (book == null) {
                continue;
            }

            if (book.getTitle().contains(title) && book.getAuthor() != null
                    && book.getAuthor().getFirstName().contains(authorFirstName)
                    && book.getAuthor().getLastName().contains(authorLastName)) {
                result.add(book);
            }
        }

        return result;
    }
}
