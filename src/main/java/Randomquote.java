import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@WebServlet("/randomquote")
public class Randomquote extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            HttpSession session = request.getSession();
            List<Quote> quotes = (List) session.getAttribute("quotes");
            Random random = new Random();
            int index = random.nextInt(quotes.size());
            System.out.println(index);
            Quote randomQuote = new Quote(quotes.get(index).getAuthor(), quotes.get(index).getContent());
            System.out.println(randomQuote.getAuthor());
            System.out.println(randomQuote.getContent());
            session.setAttribute("randomquote", randomQuote);
            getServletContext().getRequestDispatcher("/randomquote.jsp")
                    .forward(request, response);
        } catch (NullPointerException e) {
            response.getWriter().println("PUSTO");
        }

    }
}
