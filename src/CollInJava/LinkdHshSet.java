/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollInJava;

import java.util.LinkedHashSet;

/**
 *
 * @author shubi
 */
public class LinkdHshSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(9);
        hs.add(4);
        hs.add(6);
        hs.add(3);
        hs.add(7);
        hs.add(2);
        System.out.println(hs);
        //remove element by value
        hs.remove(3);
        System.out.println(hs);
    }
}
