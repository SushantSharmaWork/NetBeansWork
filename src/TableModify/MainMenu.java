/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModify;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 *
 * @author shubi
 */
public class MainMenu implements MouseListener{
    
    Frame f = new Frame("Table Modification Software");
    Button Plus = new Button("+");
    Button Delete = new Button("-");
    Button Update = new Button("Update");
    Button Get = new Button("Get");
    
    public MainMenu(){
    f.setSize(600,300);
    f.setBackground(Color.GRAY);
    ImageIcon img = new ImageIcon("G:\\MainIcon.jgp");  
    f.setIconImage(img.getImage());
    f.setLayout(null);
    f.setVisible(true);
    
    Plus.setBounds(100, 100, 150, 50);
    Plus.setBackground(Color.ORANGE);
    //Anonymous clas event
    Plus.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           Add AddID = new Add();
        }
    });
    Plus.addMouseListener(this); 
    f.add(Plus);
    
    Delete.setBounds(300, 100, 150, 50);
    Delete.setBackground(Color.ORANGE);
    Delete.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Delete RemoveID =new Delete();
        }
    
    });
    f.add(Delete);
    
    Update.setBounds(100, 200, 150, 50);
    Update.setBackground(Color.ORANGE);
    Update.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Update RemoveID =new Update();
        }
    
    });
    f.add(Update);

    Get.setBounds(300, 200, 150, 50);
    Get.setBackground(Color.ORANGE);
    Get.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Get RemoveID =new Get();
        }
    
    });
    f.add(Get);
    }
 
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public void mouseClicked(MouseEvent e) {
           Plus.setBackground(Color.BLUE);
           Delete.setBackground(Color.BLUE);
           Update.setBackground(Color.BLUE);
           Get.setBackground(Color.BLUE);
        }

        public void mousePressed(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void mouseReleased(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void mouseEntered(MouseEvent e) {
           Plus.setBackground(Color.DARK_GRAY);
           Delete.setBackground(Color.DARK_GRAY);
           Update.setBackground(Color.DARK_GRAY);
           Get.setBackground(Color.DARK_GRAY);
        }

        public void mouseExited(MouseEvent e) {     
           Plus.setBackground(Color.YELLOW);
           Delete.setBackground(Color.YELLOW);
           Update.setBackground(Color.YELLOW);
           Get.setBackground(Color.YELLOW);
        }
    

    public static void main(String[] args) {
        new MainMenu();
    }
}