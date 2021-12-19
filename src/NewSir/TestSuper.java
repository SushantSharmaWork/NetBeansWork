/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewSir;

/**
 *
 * @author shubi
 */

public class TestSuper extends SuprKeyword{
    
    public TestSuper(){
        System.out.println("Non parameter");
    }
    public TestSuper(int a){
        super (a);
        System.out.println("Child");
    }
    public TestSuper(int a, String b){
        super (a,b);
        System.out.println("child parameter");
    }
    public void info(int a, int b){
    System.out.println(super.a + super.b);
    super.info(a, b);
}
public static void main(String[] args){
new TestSuper(1,"Sushant");
new TestSuper(1);
new TestSuper();
new TestSuper().info(1,2);
}
}

