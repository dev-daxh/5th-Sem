package ServletJSP.GenericServlet;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/greetUser") // The URL pattern for this servlet
public class GreetingServlet extends GenericServlet {

    // This method handles the request and response
    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        
        // Set content type of the response
        response.setContentType("text/html");
        
        // Getting the PrintWriter object to send the response
        PrintWriter out = response.getWriter();
        
        // Reading the parameters from the request
        String name = request.getParameter("name");
        
        // Sending a response back to the client
        if (name != null) {
            out.println("<html><body>");
            out.println("<h1>Welcome, " + name + "!</h1>");
            out.println("<p>Thank you for visiting our site.</p>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h1>Hello, Guest!</h1>");
            out.println("<p>Please provide your name.</p>");
            out.println("</body></html>");
        }
    }
}

