package at.codersbay.java.advanced.common.exercises.book;


public class Book {
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle) {
        author = bookAuthor;
        title = bookTitle;
    }
}