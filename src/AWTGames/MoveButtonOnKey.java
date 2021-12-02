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
        boolean reverse = false;
    public MoveButtonOnKey(){
        setTitle("Bucket Game Basket");
        setSize(400, 400);
        setLayout(null);        
        Button Bucket = new Button("");
        Bucket.setBounds(x, y, 40, 30);
        Bucket.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT :
                {
                x = x-10;
                y = y;
                System.out.println(x);
                while(x >0){
                Bucket.setBounds(x, y, 40, 30);
                }} break;
                
                case KeyEvent.VK_RIGHT : {
                x = x+10;
                y = y;  
                System.out.println(x);
                if(x< 360){
                Bucket.setBounds(x, y, 40, 30);
                }
                }break;
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
