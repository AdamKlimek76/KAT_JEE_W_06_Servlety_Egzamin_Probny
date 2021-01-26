import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addquote")
public class Addquote extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String author = request.getParameter("author");
        String content = request.getParameter("content");
        Quote quote = new Quote(author, content);
        HttpSession session = request.getSession();
        if (session.getAttribute("quotes") == null) {
            List<Quote> quotes = new ArrayList<>();
            quotes.add(quote);
            session.setAttribute("quotes", quotes);
            response.sendRedirect("/allquotes");

        } else {
            List<Quote> quotes = (List) session.getAttribute("quotes");
            quotes.add(quote);
            session.setAttribute("quotes", quotes);
            response.sendRedirect("/allquotes");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/addquote.jsp");
    }
}
