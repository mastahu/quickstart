package it.morfoza.quickstart.library.classic;


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

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }
}
