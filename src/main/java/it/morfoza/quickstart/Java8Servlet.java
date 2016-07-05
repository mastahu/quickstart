package it.morfoza.quickstart;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import static java.util.Collections.list;

public class Java8Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ArrayList<String> params = list(req.getParameterNames());

        ServletOutputStream outputStream = resp.getOutputStream();

        params.forEach(param -> printParam(param, outputStream));

        resp.getOutputStream().print("OK");
    }

    void printParam(String param, ServletOutputStream outputStream) {
        try {
            outputStream.print( param + "=");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

