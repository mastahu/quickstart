package it.morfoza.quickstart.library.database;


import java.util.List;

public class Library {

    private BookDao bookDao;

    public Library(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> getBooks() {
        return bookDao.getBooks();
    }
}
