import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        String partName = request.getParameter("partName");
        String partType = request.getParameter("partType");

        out.println("<html><body>");
        out.println("<h2>Mobile Part Details Received</h2>");
        out.println("<p>Brand: " + brand + "</p>");
        out.println("<p>Model: " + model + "</p>");
        out.println("<p>Part Name: " + partName + "</p>");
        out.println("<p>Part Type: " + partType + "</p>");
        out.println("<form action='index.html' method='get'>");
        out.println("<button type='submit'>Back</button>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
