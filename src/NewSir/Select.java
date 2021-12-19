/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewSir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author shubi
 */
public class Select {
            public static void main(String[] args) throws Exception {
       Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cu","root","root");
       PreparedStatement ps = con.prepareStatement("select * from student");
       ResultSet rs = ps.executeQuery();
       while(rs.next())  {
       String r=rs.getString("roll");
       String n=rs.getString("name");
       String c=rs.getString("course");
       String e=rs.getString("email");
       String a=rs.getString("address");
       
           System.out.println(r+" "+n+" "+c+" "+e+" "+a);
           
       }  
       }
}
