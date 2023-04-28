
package sessonservler;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstSessonServlet extends HttpServlet {
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
      
        
        response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String str = request.getParameter("un");
    
   
    out.println("You r Wlc" + str);
   HttpSession session=request.getSession();  
        session.setAttribute("n",str);  
    
    out.println("<form action = 'session2'  method = 'Post'>");
    out.println("<input type= 'submit' value = 'go'>");
    out.println("</form");
    
    
    
    }
}
