/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AwtPackageTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;

/**
 *
 * @author Sushant
 */
public class FrameAndButton extends Frame{

    public FrameAndButton(){
    setSize(500,500);
    setBackground(Color.yellow);
    
    Button b = new Button();
    b.setSize(200,200);
    b.setBackground(Color.blue);
    b.setBounds(10, 300, 100, 50);
    
    TextField t = new TextField();
    t.setBounds(100, 300, 400, 50);
    }
    
    public static void main(String[] args) {
     new FrameAndButton();
    }
}
