package it.morfoza.quickstart;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long number1 = Long.parseLong(req.getParameter("number1"));
        long number2 = Long.parseLong(req.getParameter("number2"));
        req.setAttribute("result", number1 + number2);
        req.getRequestDispatcher("/WEB-INF/calculator.jsp").forward(req, resp);
    }
}
