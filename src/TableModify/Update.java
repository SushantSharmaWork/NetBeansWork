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
public class Update extends Frame implements MouseListener{

    Button Update = new Button("Update");
    Button back = new Button("Back");

    public Update(){
    setSize(600,350);
    setBackground(Color.GRAY);
    setLayout(null);
    setVisible(true);
    setTitle("Update");
    TextField ID = new TextField();
    ID.setBounds(150, 100, 400, 50);
    add(ID);
    
    back.setBounds(50, 50, 70, 40);
    back.setBackground(Color.ORANGE);
    add(back);
    back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
             new MainMenu();
        }
    });
    Update.setBounds(200, 200, 150, 50);
    Update.setBackground(Color.ORANGE);
    add(Update);
    
    Label Updated = new Label("Updated Successfully");
    Updated.setBounds(200, 250, 200, 50);
    Updated.setVisible(false);
    add(Updated);
    
    Update.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        Updated.setVisible(true);
    }
    });
}

    @Override
    public void mouseClicked(MouseEvent e) {
           Update.setBackground(Color.BLUE);
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
           Update.setBackground(Color.DARK_GRAY);
    }

    @Override
    public void mouseExited(MouseEvent e) {
           Update.setBackground(Color.YELLOW);
    }
}