/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewSir;

import java.util.Arrays;

/**
 *
 * @author Sushant
 */
public class StringOperations {
   
    //We will use string operations to perform reverse of string
    public static void main(String[] args) {

    String title = "My name is Sushant";
    String revAll;
    char last;
    int sizeDec = title.length();
    char arr[] = new char[title.length()];
    for(int i=0;i<title.length();i++){
       last = title.charAt(i);
      // char temp = title.charAt(title.length()-1);
      //revAll.concat(last);
      arr[sizeDec] = last;
      sizeDec--;
      // System.out.println(sizeDec);
      //System.out.println(last);
    }
    revAll = String.valueOf(arr);
    System.out.println(arr[1]);   
    } 
}
