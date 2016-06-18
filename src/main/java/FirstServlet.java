import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String html = "" +
                "<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "   <h3>Hello world</h3>" +
                "   <script>alert('Hello World!')</script>" +
                "</body>" +
                "</html>";
        resp.getOutputStream().print(html);
    }
}
