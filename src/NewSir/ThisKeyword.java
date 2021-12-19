/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewSir;

/**
 *
 * @author shubi
 */
public class ThisKeyword {
    int roll; //instance variable
    String name;
    String stream;
    String clg = "Chandigarh University";
    public ThisKeyword(){
        System.out.println(roll+" "+name+" "+stream);
    }
    
    public ThisKeyword(int roll, String name, String stream)//local variables
    {
        int localvar= 1; //local variable
        this.roll = roll;
        this.name = name;
        this.stream = stream;
        System.out.println("(Inside Constructor )"+roll+" "+name+" "+stream);
    }
    
    public ThisKeyword(ThisKeyword obj){
        this.roll= obj.roll;
        this.name = obj.name;
        this.stream = obj.stream;
        System.out.println("(Inside object Constructor )"+roll+" "+name+" "+stream);
    }
    
    public void info(){
        System.out.println("--------------------------------");
        System.out.println("Roll no. is "+ roll+"\nName is "+name+"\nStream is "+stream);
        System.out.println("--------------------------------");
    }
    public static void main(String[] args) {
        ThisKeyword s1 = new ThisKeyword(1, "Sushant", "Non-Medical"); //s1 is refrence variable
        ThisKeyword s2 = new ThisKeyword(2, "Aman", "Medical");
        ThisKeyword s3 = new ThisKeyword(s2);
        s1.info();
        s3.info();
    }
}
