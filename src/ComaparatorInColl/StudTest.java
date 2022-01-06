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
public class StudTest {
    public static void main(String[] args) {
        ArrayList<StudentCompareTo> t=new ArrayList<>();
        t.add(new StudentCompareTo(5,"Sushant",250));
        t.add(new StudentCompareTo(2,"Ishant",202));
        t.add(new StudentCompareTo(8,"Aman",300));
        t.add(new StudentCompareTo(3,"Saurav",150));
            Collections.sort(t);
            System.out.println(t);
    }
    

}
