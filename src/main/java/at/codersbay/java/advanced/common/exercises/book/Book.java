package at.codersbay.java.advanced.common.exercises.book;


public class Book {
    // The fields.
    private String author;
    private String title;

    private int pages;

    private String ref;

    private boolean courseText;

    private int borrowed = 0;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages, boolean courseText) {
        author = bookAuthor;
        title = bookTitle;
        this.pages = pages;
        this.ref = "";
        this.courseText = courseText;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void printAuthor() {
        System.out.println(this.author);
    }

    public void printTitle() {
        System.out.println(this.title);
    }

    public void printDetails() {
        String ref = this.ref;

        if(ref == null ||ref.trim().length() == 0) {
            ref = "ZZZ";
        }
        System.out.println("Author: " +  this.author + ", Title: " + this.title + ", pages: " + pages +
                ", ref: " + ref + ", borrowed :" + borrowed);
    }

    public void setRefNumber(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        if(ref != null && ref.trim().length() > 3) {
            this.ref = ref;
        }
    }

    public boolean isCourseText() {
        return courseText;
    }

    public void setCourseText(boolean courseText) {
        this.courseText = courseText;
    }

    public int getBorrowed() {
        return borrowed;
    }

    public void borrow() {
        this.borrowed += 1;
    }
}