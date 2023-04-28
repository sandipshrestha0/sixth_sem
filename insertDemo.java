
package jdbc;

import java.sql.*;
public class insertDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver"); // sql connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", ""); //path
        Statement st = con.createStatement();
        int a = st.executeUpdate("insert into student values(3,'shyam','birgunj')"); // data insert
        System.out.println(a + "row is inserted");
        st.close();
        con.close();
    }
}
