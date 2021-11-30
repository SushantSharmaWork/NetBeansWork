/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AWTGames;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author shubi
 */
public class MoveButtonOnKey extends Frame{
        int x = 0;
        int y = 350;
    public MoveButtonOnKey(){
        setTitle("Bucket Game Basket");
        setSize(400, 400);
        setLayout(null);        
        Button Bucket = new Button("");
       // Bucket.setBounds(100,100,100,100);
        Bucket.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                
                if (x >= 360){
                x = x-10;
                y = y;  
                System.out.println(x);
                Bucket.setBounds(x, y, 40, 30);
                }
                else
                {
                x = x+10;
                y = y;
                System.out.println(x);                
                Bucket.setBounds(x, y, 40, 30);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        add(Bucket);
        Bucket.setVisible(true);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            dispose();        }
        });
    }
    
    public static void main(String[] args) {
        new MoveButtonOnKey();
    }
}
