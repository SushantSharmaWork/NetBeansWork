/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModify;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author shubi
 */
public class Get extends Frame implements MouseListener {
    Button Get = new Button("Update");
    Button back = new Button("Back");
    public Get(){
    setSize(600,350);
    setBackground(Color.GRAY);
    setLayout(null);
    setVisible(true);
    setTitle("Get");
    TextField ID = new TextField();
    ID.setBounds(150, 100, 400, 50);
    add(ID);
    
    Get.setBounds(200, 200, 150, 50);
    Get.setBackground(Color.ORANGE);
    add(Get);
   
    back.setBounds(50, 50, 70, 40);
    back.setBackground(Color.ORANGE);
    add(back);
    back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
             new MainMenu();
        }
    });
    Label deleted = new Label("Search was successfull");
    deleted.setBounds(200, 250, 200, 50);
    deleted.setVisible(false);
    add(deleted);
    
    Get.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        deleted.setVisible(true);
    }
    });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
           Get.setBackground(Color.BLUE);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
           Get.setBackground(Color.DARK_GRAY);
    }

    @Override
    public void mouseExited(MouseEvent e) {
           Get.setBackground(Color.YELLOW);
    }
    
}
