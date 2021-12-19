/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewSir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author shubi
 */
public class DeleteWithScan {
        public static void main(String[] args) throws Exception {
       Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cu","root","root");
       Statement s = con.createStatement();
        Scanner sc = new Scanner(System.in);
       String st = "insert into student values(?,?,?,?,?)";
       PreparedStatement ps = con.prepareStatement(st);
       
       while(true){
       System.out.println("Enter roll no: ");
       int r = sc.nextInt();
       s.executeUpdate("delete from student where roll ="+r);
           System.out.println("Deletion done");
            System.out.println("Do you wish to continue? (YES/NO)");
            String option = sc.next();
            if(option.equalsIgnoreCase("no")){
                break;
            }
       }
        }
}
