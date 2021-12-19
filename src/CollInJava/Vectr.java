/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollInJava;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author shubi
 */
public class Vectr {
    public static void main(String[] args) {
        Vector<Integer> vtr = new Vector<Integer>();
        vtr.add(2);
        vtr.add(9);
        vtr.add(3);
        vtr.add(7);
        vtr.add(2);
        vtr.add(8);
        vtr.add(1);
        vtr.add(6);
        vtr.add(5);
        vtr.add(5);
        System.out.println(vtr);
        //we can remove by value in vector but in other we can use only index
        vtr.removeElement(5);
        //In vector we use enumeration
        System.out.println("Using enumeration");
        Enumeration e = vtr.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        
        
        
    }
}
