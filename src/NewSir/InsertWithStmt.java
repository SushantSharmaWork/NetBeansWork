/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewSir;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author shubi
 */
public class InsertWithStmt {
    public static void main(String[] args) throws Exception {
       Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cu","root","root");
       Statement s = con.createStatement();
       String s1 = "insert into student values(3,'Yogesh','MBA','Priya@gmail.com','BNG')";
       int i = s.executeUpdate(s1);
       if (i>0){
           System.out.println("Insertion completed");
       }
       
       //insertion with Scanner class
       Scanner sc = new Scanner(System.in);
       String st = "insert into student values(?,?,?,?,?)";
       PreparedStatement ps = con.prepareStatement(st);
       
       while(true){
       System.out.println("Enter roll no: ");
       int roll = sc.nextInt();
       System.out.println("Enter name: ");
       String name = sc.next();
       System.out.println("Enter Course: ");
       String course = sc.next();
       System.out.println("Enter Email: ");
       String email = sc.next();
       System.out.println("Enter Address: ");
       String add = sc.next();
       
       ps.setInt(1, roll);
       ps.setString(2, name);
       ps.setString(3, course);
       ps.setString(4, email);
       ps.setString(5, add);
        int j  = ps.executeUpdate();
        if(j>0){
            System.out.println("Insertion completed.");
        }
            System.out.println("Do you wish to continue? (YES/NO)");
            String option = sc.next();
            if(option.equalsIgnoreCase("no")){
                break;
            }
        }
       //i = s.executeUpdate("insert into table values(roll,name,email,add)");
}
}

