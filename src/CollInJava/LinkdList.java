/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollInJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author shubi
 */
public class LinkdList {
    public static void main(String[] args) {
        LinkedList<Integer> lkd = new LinkedList<>();
        lkd.add(8);
        lkd.add(1);
        lkd.add(6);
        lkd.add(3);
        lkd.add(7);
        lkd.add(5);
        lkd.add(6);
        lkd.add(5);
        System.out.println(lkd);
        //Normal print
        System.out.println("Forward direction");
        //iterator
        Iterator itr = lkd.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Backward direction");
        ListIterator ltr = lkd.listIterator();
        //Printing backward using ListIterator
        while(ltr.hasPrevious()){
            System.out.println(ltr);
        }
        //for loop
        for(int i : lkd){
            System.out.println(i);
        }
        lkd.addFirst(10);
        lkd.addLast(11);
        System.out.println(lkd);
    }
}
