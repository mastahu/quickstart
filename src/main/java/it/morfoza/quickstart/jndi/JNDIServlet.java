package it.morfoza.quickstart.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JNDIServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MyBean bean;
        try {
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            int a = 1;
            Object o = envCtx.lookup("bean/MyBeanFactory2");
            //bean = (MyBean) envCtx.lookup("bean/MyBeanFactory");
            bean = new MyBean();
        } catch (NamingException e) {
            throw new ServletException(e);
        }


        String html = "" +
                "<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "foo = " + bean.getFoo() + ", bar = " + bean.getBar() +
                "</body>" +
                "</html>";
        resp.getOutputStream().print(html);
    }
}
