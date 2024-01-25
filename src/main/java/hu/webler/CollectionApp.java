package hu.webler;

import hu.webler.model.Book;

public class CollectionApp {

    public static void main(String[] args) {

        // package names are not regarding naming conventions!!! just for study purposes, to see the difference between
        // the collections!

        Book book = new Book("The Lord of the Rings", "J. R. R. Tolkien", 1954);
        System.out.println(book);
    }
}