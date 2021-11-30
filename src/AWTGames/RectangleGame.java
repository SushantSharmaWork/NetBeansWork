/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AWTGames;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author shubi
 */
public class RectangleGame extends Frame {
    public int ClickCount= 0;
    public RectangleGame(){
    setSize(400,400);
    setLayout(null);
    setTitle("Click Game");
    Label points = new Label("Points are : ");
    points.setBounds(200, 30, 150, 50);
    points.setBackground(Color.red);
    Button Box = new Button("Click me");
    Box.setBounds(100, 150, 70, 30);
    Box.addMouseListener(new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            ClickCount++;
            System.out.println(ClickCount);
            
           // points.setText(ClickCount);   
           points.setText("Points are : "+ClickCount);
            points.setVisible(true);
        }
        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Pressed");        }

        @Override
        public void mouseReleased(MouseEvent e) {
  System.out.println("Released");         }

        @Override
        public void mouseEntered(MouseEvent e) {
  System.out.println("Released");         }

        @Override
        public void mouseExited(MouseEvent e) {
  System.out.println("Exited");         }
        
    });
        addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            dispose();        }
        });
    add(points);
    points.setVisible(true);
    add(Box);
    Box.setVisible(true);
    setVisible(true);
    }
    public static void main(String[] args) {
        new RectangleGame();
    }
}
