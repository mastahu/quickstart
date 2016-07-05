package it.morfoza.quickstart;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import static java.util.Collections.list;

public class STLServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("languages", new String[]{"Java", "C", "C++", "C#", "Ruby", "JavaScript", "Groovy"});
        request.getRequestDispatcher("/WEB-INF/stl.jsp").forward(request, response);
    }
}

