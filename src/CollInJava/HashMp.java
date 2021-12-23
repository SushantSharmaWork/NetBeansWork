/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *```````````````
 * @author shubi
 */
public class HashMp {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "sun");
        hm.put(2, "fri");
        hm.put(3, "mon");
        hm.put(4, "wed");
        System.out.println(hm);
        Set<Map.Entry<Integer,String>> s = hm.entrySet(); //HashMap to set conversion
        Iterator itr = s.iterator();
    }
}
