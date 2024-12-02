package ServletJSP.ServletCookie;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = {"/addCookieServlet"})
public class addCookieServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try (PrintWriter pw = resp.getWriter()) {
            String data = req.getParameter("data");

           
                Cookie ck = new Cookie("MyCookie", data);
                resp.addCookie(ck);
                pw.println("<html><head>");
                pw.println("<title>addCookieServlet</title>");
                pw.println("</head><body>");
                pw.println("<b>MyCookie has been sent: </b>" + data);
                pw.println("<br><a href='http://localhost:8080/CookieServlet/getCookieServlet'>Click here to view your cookies!</a>");
                pw.println("</body></html>");
            
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
