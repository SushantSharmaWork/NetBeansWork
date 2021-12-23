/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModify;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.*;

/**
 *
 * @author shubi
 */
public class InputFile {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
        Class.forName("com.mysql.jdbc.Driver"); //loads jdbc driver
        //gets connection to url having file structure of database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/filehandling","root","root");
        String s = "insert into stufile values(?,?,?)";
        PreparedStatement p = con.prepareStatement(s); //we insert statement via connection
        File f=new File("C:\\Users\\shubi\\Desktop\\DeletingFile.txt");
        FileReader fr = new FileReader(f);
        
        p.setString(1, "Sushant");
        p.setString(2,"1");
        p.setCharacterStream(3, fr,(int)f.length());
        
        int i = p.executeUpdate(); //used to update query to database
        System.out.println("File inserted");
        
        //using select startement
        FileReader fw =new FileReader(f);
        String s2 = "Select * from stufile";
        PreparedStatement ps = con.prepareStatement(s2);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
       String r=rs.getString("name");
       String n=rs.getString("ID");
       Blob blob = rs.getBlob("file");
       //incomplete
         //   System.out.println(name+" "+ ID+" "+file);
        }
        
    }
}
