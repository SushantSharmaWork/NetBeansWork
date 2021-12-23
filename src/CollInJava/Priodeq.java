/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollInJava;

import java.util.PriorityQueue;

/**
 *
 * @author shubi
 */
public class Priodeq {
    public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(7);
    pq.add(9);
    pq.add(4);
    pq.add(2);
    pq.add(12);
    pq.add(21);
    pq.add(14);
    pq.add(16);
    System.out.println(pq);
    System.out.println("Peek "+pq.peek()); //Shows first element
    System.out.println("Poll "+pq.poll()); //Removes first element
    System.out.println("After poll "+pq);
    }
}
