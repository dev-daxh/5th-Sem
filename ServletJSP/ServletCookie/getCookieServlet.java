package ServletJSP.ServletCookie;
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = {"/getCookieServlet"})
public class getCookieServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try (PrintWriter pw = resp.getWriter()) {
            Cookie[] cookies = req.getCookies();
            pw.println("<html><head>");
            pw.println("<title>getCookieServlet</title>");
            pw.println("</head><body>");
            pw.println("<b>");

            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    String name = cookie.getName();
                    String value = cookie.getValue();
                    pw.println("Name: " + name + " Value: " + value + "<br>");
                    
                    
                    pw.println("<br><a href='http://localhost:8080/CookieServlet/'>Click here to go on home page!</a>");

                }
            } else {
                pw.println("No cookies found.");
            }

            pw.println("</b>");
            pw.println("</body></html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
