import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/receiver")
public class Receiver extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name=request.getParameter("name");
    String mail=request.getParameter("mail");
    int id=Integer.parseInt(request.getParameter("id"));

    response.getWriter().println(name);
    response.getWriter().println(mail);
    response.getWriter().println(id);
    }
}
