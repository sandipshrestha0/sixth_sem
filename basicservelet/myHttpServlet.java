
package basicservelet;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class myHttpServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("uname");
        
        out.println("<html><body>");
        out.println("name is " + name);
        out.println("</body></html>");
        out.close();
    }
}
