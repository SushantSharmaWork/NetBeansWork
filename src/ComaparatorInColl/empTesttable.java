/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComaparatorInColl;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author shubi
 */
public class empTesttable {
        public static void main(String[] args) {
        ArrayList<Employee> t=new ArrayList<>();
        t.add(new Employee(5,"Sushant",250));
        t.add(new Employee(2,"Ishant",202));
        t.add(new Employee(8,"Aman",300));
        t.add(new Employee(3,"Saurav",150));
            Collections.sort(t, new IdComprEMp());
            System.out.println(t);
}
}
