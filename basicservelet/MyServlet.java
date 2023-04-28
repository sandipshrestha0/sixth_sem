
package basicservelet;

import javax.servlet.*;
//import jakarta.servlet.*;
import java.io.*;
public class MyServlet implements Servlet
    {
    ServletConfig config = null;
    public void init(ServletConfig config){
        this.config = config;
    }
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("This is my web app");
        out.println("</body></html>");
        out.close();
    }
    public void destroy()
    {
        System.out.println("Servlet Destroyed");
    }
    public  ServletConfig getServletConfig()
    {
        return config;
    }
    public String getServletInfo()
    {
        return("Servlet info is here");
    }
}
