package it.morfoza.quickstart.library;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Library {

    INSTANCE;

    private List<Book> books = new ArrayList<>();

    Library() {
        books.add(new Book("War and Peace", "Leo Tolstoy"));
        books.add(new Book("Hollywood", "Charles Bukowski"));
    }

    List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }
}
