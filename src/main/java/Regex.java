import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/regex")
public class Regex extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param1 = request.getParameter("param1");
        boolean check=verifyParam(param1);
        String address="https://www.google.pl/#q=cat.jpg";
        String newAddress=address.replaceAll("cat.jpg", param1);
        if(check){
            response.sendRedirect(newAddress);
        }else{
            response.getWriter().append("Niepoprawna nazwa");
        }

    }


    static boolean verifyParam(String param) {

        Pattern compiledPattern = Pattern.compile("[a-z]+\\.((jpg)|(png)|(gif))");
        Matcher matcher = compiledPattern.matcher(param);
        return matcher.matches();

    }
}