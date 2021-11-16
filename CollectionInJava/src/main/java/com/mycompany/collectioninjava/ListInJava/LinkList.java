/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.collectioninjava.ListInJava;

import java.util.LinkedList;

/**
 *
 * @author shubi
 */
public class LinkList {
     public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();

    // add elements
    languages.add("Python");
    languages.add("Java");
    languages.add("C");
    System.out.println("LinkedList: " + languages);

    // access the first element
    String str1 = languages.peek();
    System.out.println("Accessed Element: " + str1);

    // access and remove the first element
    String str2 = languages.poll();
    System.out.println("Removed Element: " + str2);
    System.out.println("LinkedList after poll(): " + languages);

    // add element at the end
    languages.offer("Swift");
    System.out.println("LinkedList after offer(): " + languages);
  }

}
