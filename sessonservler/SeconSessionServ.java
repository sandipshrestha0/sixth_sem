
package sessonservler;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;

public class SeconSessionServ extends HttpServlet{
       public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
       
          HttpSession session=request.getSession(false);  
        String n=(String)session.getAttribute("n");  
        out.print("Hello world "+n);  
        out.close();
    } 
}
