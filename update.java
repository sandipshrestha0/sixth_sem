/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author bcaba
 */
public class update {
     public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver"); // sql connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca6", "root", ""); //path
        Statement st = con.createStatement();
        int a = st.executeUpdate("update student set id=1, name='suman', address='bhatatpur' where id=3"); // data insert
        System.out.println(a + "row is updated");
        st.close();
        con.close();
    }
    
}
