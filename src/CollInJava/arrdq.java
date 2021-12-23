/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollInJava;

import java.util.ArrayDeque;

/**
 *
 * @author shubi
 */
public class arrdq {
    public static void main(String[] args) {
    ArrayDeque<Integer> ad = new ArrayDeque<>();
    ad.add(5);
    ad.add(2);
    ad.add(9);
    ad.add(7);
    //We can add and remove first or last element
    ad.addFirst(4);
    ad.addLast(1);
    System.out.println(ad);
    System.out.println(ad.peek());
    System.out.println(ad.peekFirst());
    System.out.println(ad.peekLast());
    ad.pollFirst();
    ad.pollLast();
    System.out.println(ad);
}}
