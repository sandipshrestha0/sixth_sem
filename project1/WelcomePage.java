
package project1;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class WelcomePage extends HttpServlet {
      public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("uname");
        
        out.println("<html><body>");
        out.println("<form action = 'inse'  method = 'Post'>");
        out.println("Id :- <input type=\"text\" name=\"id\"><br></br>");
        out.println("UserName :- <input type=\"text\" name=\"un\"><br></br>");
        out.println("Address :- <input type=\"text\" name=\"add\"><br></br>");
        out.println("<input type= 'submit' value = 'go'>");
    out.println("</form");
    
        out.println("</body></html>");
        out.close();
    }
}
