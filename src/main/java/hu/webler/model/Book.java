package hu.webler.model;

/**
 * Created by Webler on 2017. 12. 03.
 * This is a book class
 * Fields: title, author, year
 */
public class Book {

    private String title;
    private String author;
    private int year;

    public Book() {
    }

    /**
     * Constructor
     * @param title
     * @param author
     * @param year
     */
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    /**
     * Get title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get author
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Set author
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Get year
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * Set year
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * To string
     * @return string
     */
    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", year=" + year + '}';
    }
}
