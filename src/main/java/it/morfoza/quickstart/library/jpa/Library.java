package it.morfoza.quickstart.library.jpa;


public class Library {

    private BookDao bookDao;

    public Library(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Iterable<Book> getBooks() {
        return bookDao.findAll();
    }
}
