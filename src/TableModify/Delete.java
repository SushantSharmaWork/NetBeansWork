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
public class Delete extends Frame implements MouseListener{
    Button Delete = new Button("Delete");
    public Delete(){
    setSize(800,800);
    setBackground(Color.GRAY);
    setLayout(null);
    setVisible(true);
    
    TextField ID = new TextField();
    ID.setBounds(150, 100, 400, 50);
    add(ID);
    

    Delete.setBounds(200, 200, 150, 50);
    Delete.setBackground(Color.ORANGE);
    add(Delete);


    Label Success = new Label("Values Removed Successfully");
    Success.setBounds(200, 250, 200, 50);
    Success.setVisible(false);
    add(Success);
      
    Delete.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Success.setVisible(true);
        }
    });    
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    Delete.setBackground(Color.BLUE);      }

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
    Delete.setBackground(Color.DARK_GRAY);  
    }

    @Override
    public void mouseExited(MouseEvent e) {
    Delete.setBackground(Color.YELLOW);  
    }
}