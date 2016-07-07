package it.morfoza.quickstart.library.classic;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListBooksServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Library library = Library.INSTANCE;
        req.setAttribute("books", library.getBooks());
        req.getRequestDispatcher("/WEB-INF/jsp/library/list_books.jsp").forward(req, resp);
    }
}
