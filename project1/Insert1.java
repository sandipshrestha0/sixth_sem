
package project1;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Insert1 extends HttpServlet {
     public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");//sql define......
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", "");// connection .......
        PreparedStatement pst = con.prepareStatement("insert into student value(?,?,?) ");
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setString(3, address);
        int b = pst.executeUpdate();
        out.println(b + "Row is inserted");
        
        pst.close();
        con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
