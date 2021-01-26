import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/homepage")
public class Homepage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Cookie[] cookies = request.getCookies();
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("cookieacc")) {
                    Cookie cookie = new Cookie(cookies[i].getName(), cookies[i].getValue());
                    response.addCookie(cookie);

                    getServletContext().getRequestDispatcher("/homepage.jsp")
                            .forward(request, response);
                }
            }
            //response.getWriter().println("some cookie");
            //getServletContext().getRequestDispatcher("/homepage.jsp")
                   //.forward(request, response);
            response.sendRedirect("/homepage.jsp");

        } catch (NullPointerException e) {

            getServletContext().getRequestDispatcher("/homepage.jsp")
                    .forward(request, response);
        }

    }
}
