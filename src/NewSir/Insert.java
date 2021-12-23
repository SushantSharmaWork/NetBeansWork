package NewSir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author shubi
 */
public class Insert  {
     public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cu","root","root");
        String s ="insert into student values(?,?,?,?,?)"; //no. of columns
        PreparedStatement p = con.prepareStatement(s);
        p.setString(1,"1");
        p.setString(2,"Sushant");
        p.setString(3,"php");
        p.setString(4,"2@gmail.com");
        p.setString(5,"kol");
        int i = p.executeUpdate();
        if(i>0){
            System.out.println("Done");
        }
     }
    
}
