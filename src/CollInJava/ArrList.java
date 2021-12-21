/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollInJava;
import java.util.*;
/**
 *
 * @author shubi
 */
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> stu = new ArrayList<>();
        stu.add(1);
        stu.add(5);
        stu.add(3);
        stu.add(7);
        stu.add(4);
        stu.add(6);
        stu.add(6);
        //Normal print
        System.out.println("Printing with sout "+stu);
        //removing value in arraylist
        stu.remove(3);
        System.out.println("After removing value from index "+stu);
        //using iterator
        Iterator itr = stu.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Using for loop ");
        //using for each loop
        for(int a : stu){
            System.out.println(a);
        }
    }
}
