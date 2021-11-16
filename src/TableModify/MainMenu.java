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
public class MainMenu implements ActionListener{
    
    Frame f = new Frame("Table Modification Software");
    public MainMenu(){
    f.setSize(600,300);
    f.setBackground(Color.GRAY);
    ImageIcon img = new ImageIcon("G:\\MainIcon.jgp");  
    f.setIconImage(img.getImage());
    f.setLayout(null);
    f.setVisible(true);
    
    Button Plus = new Button("+");
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
    
    Button Delete = new Button("-");
    Delete.setBounds(300, 100, 150, 50);
    Delete.setBackground(Color.MAGENTA);
    Delete.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Delete RemoveID =new Delete();
        }
    
    });
    f.add(Delete);
    
    Button Update = new Button("Update");
    Update.setBounds(100, 200, 150, 50);
    Update.setBackground(Color.ORANGE);
    Update.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Update RemoveID =new Update();
        }
    
    });
    f.add(Update);
 
    Button Get = new Button("Get");
    Get.setBounds(300, 200, 150, 50);
    Get.setBackground(Color.YELLOW);
    Get.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Get RemoveID =new Get();
        }
    
    });
    f.add(Get);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public void mouseClicked(MouseEvent e) {
           Plus.setBackground(Color.YELLOW);
        }

        public void mousePressed(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void mouseReleased(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void mouseEntered(MouseEvent e) {
         Plus.setBackground(Color.CYAN);
        }

        public void mouseExited(MouseEvent e) {
        Plus.setBackground(Color.YELLOW);        }
    

    public static void main(String[] args) {
        new MainMenu();
    }
}