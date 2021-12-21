/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollInJava;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author shubi
 */
public class HashSt {
    public static void main(String[] args) {
        //HashSet allows null element. TreeSet doesnot allow.
        HashSet<String> hs = new HashSet<>();
        hs.add("Mon");
        hs.add("wed");
        hs.add("tue");
        hs.add("fri");
        hs.add("abc");
        hs.add("xyz");
        hs.add("sdf");
        System.out.println(hs);
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
