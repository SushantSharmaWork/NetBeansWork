/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollInJava;

import java.util.Enumeration;
import java.util.Stack;

/**
 *
 * @author shubi
 */
public class stck {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(6);
        st.push(9);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        Enumeration e = st.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        
    }
}
