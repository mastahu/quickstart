package it.morfoza.quickstart.library.spring;


import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListBooksServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(req.getSession().getServletContext());

        Library library = webApplicationContext.getBean(Library.class);
        req.setAttribute("books", library.getBooks());
        req.getRequestDispatcher("/WEB-INF/jsp/library/list_books.jsp").forward(req, resp);
    }
}
