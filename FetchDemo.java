/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.*;
public class FetchDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver"); // sql define
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", ""); //connection
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from student");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3));
        }
        st.close();
        con.close();
    }
    }
