/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollInJava;

import java.util.TreeSet;

/**
 *
 * @author shubi
 */
public class TrSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(9);
        ts.add(1);
        ts.add(7);
        ts.add(3);
        ts.add(6);
        ts.add(4);
        ts.add(8);
        ts.add(5);
        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println(ts.isEmpty());
    }
}
