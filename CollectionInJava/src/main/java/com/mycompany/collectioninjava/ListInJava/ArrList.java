/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.collectioninjava.ListInJava;
import java.util.*;
/**
 *
 * @author shubi
 */
public class ArrList {

    public static void main(String[] args){
    ArrayList ArraList = new ArrayList();
    ArraList.add(1);
    ArraList.add("Sushant");
    ArraList.add("Sharma");
    ArraList.add(2);
    ArraList.add("mohali");
    // Creating another empty array list
    ArrayList<String> boxes = new ArrayList<String>();
    boxes.add("pen");
    boxes.add("Sushant");
    boxes.add("books");
    boxes.add("Priya");
    boxes.add("ink");
    
    System.out.println(ArraList);
    System.out.println("Adding new name at 1 index");
    ArraList.add(1,"Shubham");
    System.out.println(ArraList);
    
   //set used to replace elements
   ArraList.set(3,"Priya");
   ArraList.set(4,"Yogesh");
   System.out.println(ArraList);   
   
   //removing elements
   ArraList.remove(0);
   System.out.println(ArraList);
   
   //iterating elements
   for(Object o: ArraList){
   System.out.println(o);
   }
   
   //size 
   System.out.println(ArraList.size());
   
   //sort
   Collections.sort(ArraList);
   System.out.println(ArraList);
   
   //give index of element
   int pos = ArraList.indexOf("Sushant");
   String str = (String) ArraList.get(2);
   System.out.println("position is "+ pos+" Element is "+ str);
   
   //contains
   System.out.println(ArraList.contains("Sushant"));
   
   //retainAll
   ArraList.retainAll(boxes);
   System.out.println(ArraList);
}
}

