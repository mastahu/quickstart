package it.morfoza.quickstart.jndi;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JavaMailServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Session session;
        try {
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            session = (Session) envCtx.lookup("mail/Session");
        } catch (NamingException e) {
            throw new ServletException(e);
        }


        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("mastahu@o2.pl"));
            InternetAddress to[] = new InternetAddress[1];
            to[0] = new InternetAddress("test@gowo.pl");
            message.setRecipients(Message.RecipientType.TO, to);
            message.setSubject("Temat");
            message.setContent("Treść maila", "text/plain");
            Transport.send(message);
        } catch (MessagingException e) {
            throw new ServletException(e);
        }

        String html = "" +
                "<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "foo = mail wyslano" +
                "</body>" +
                "</html>";
        resp.getOutputStream().print(html);
    }
}
