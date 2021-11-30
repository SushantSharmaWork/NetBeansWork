/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModify;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
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
    Button Add = new Button("+");
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
    
    Panel panel=new Panel();  
    panel.setBounds(100,100,150,50);    
    panel.setBackground(Color.ORANGE);  
    Add.setBounds(100, 100, 150, 50);
    Add.setBackground(Color.ORANGE);

        Add.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            Add.setBackground(Color.BLUE);
            new Add();
            f.dispose(); 
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        Add.setBackground(Color.LIGHT_GRAY);        }

        @Override
        public void mouseExited(MouseEvent e) {
        Add.setBackground(Color.ORANGE);
        }
    }); 
    f.add(Add);
    f.add(panel);
    Delete.setBounds(300, 100, 150, 50);
    Delete.setBackground(Color.ORANGE);
       Delete.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            Delete.setBackground(Color.BLUE);
            new Delete();
            f.dispose(); 
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        f.setVisible(false); 
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        Delete.setBackground(Color.LIGHT_GRAY);        }

        @Override
        public void mouseExited(MouseEvent e) {
        Delete.setBackground(Color.ORANGE);
        }
    }); 
    f.add(Delete);
    
    Update.setBounds(100, 200, 150, 50);
    Update.setBackground(Color.ORANGE);
       Update.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            Update.setBackground(Color.BLUE);
            new Update();
            f.dispose(); 
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        f.setVisible(false);     
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        Update.setBackground(Color.LIGHT_GRAY);        }

        @Override
        public void mouseExited(MouseEvent e) {
        Update.setBackground(Color.ORANGE);
        }
    }); 
    f.add(Update);

    Get.setBounds(300, 200, 150, 50);
    Get.setBackground(Color.ORANGE);
       Get.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            Get.setBackground(Color.BLUE);
            new Get();
            f.dispose(); 
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        f.setVisible(false);  
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        Get.setBackground(Color.LIGHT_GRAY);        }

        @Override
        public void mouseExited(MouseEvent e) {
        Get.setBackground(Color.ORANGE);
        }
    }); 
       f.add(Get);
    
    Update.setBounds(100, 200, 150, 50);
    Update.setBackground(Color.ORANGE);
       Update.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            Update.setBackground(Color.BLUE);
            new Update();
            f.dispose(); 
        }
        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           // f.setVisible(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        Update.setBackground(Color.LIGHT_GRAY);        }

        @Override
        public void mouseExited(MouseEvent e) {
        Update.setBackground(Color.ORANGE);
        }
    });
    f.add(Update);
    }
 
    public static void main(String[] args) {
        new MainMenu();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
  }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @ Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}