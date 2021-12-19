/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewSir;

/**
 *
 * @author shubi
 */
public class SuprKeyword {
int a = 10; 
int b = 20;
int c = a-b;

public SuprKeyword(){
c = a+b;
System.out.println("Parent class called default constructor");
}

public SuprKeyword(int a){
    System.out.println("Parent");
}
public SuprKeyword(int a, String b){
    System.out.println("Parent class prarameterized constructor "+a+" "+b);
}

public void info(int a, int b){
    System.out.println("Parent class method "+" "+a+" "+b);
}
}