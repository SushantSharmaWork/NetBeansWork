/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package AwtLearn;
import java.awt.*;
/**
 *
 * @author shubi
 */
public class TestBoxAndButton extends Frame {
    setSize(400,400);
    setBackground(Color.yellow);
    
    Button b = new Button("Save");
    b.setBounds(60,20,60,30);
    add(b);
    setLayout(null);
    setVisible(true);
    
    TextField t = new TextField();
    add(t);
    t.setBounds(150,80,120,30);
    
}

public static void main(String[] args){
TestBoxAndButton a = new TestBoxAndButton();
}