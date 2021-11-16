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

/**
 *
 * @author shubi
 */
public class Get extends Frame {
    public Get(){
    setSize(800,800);
    setBackground(Color.GRAY);
    setLayout(null);
    setVisible(true);
    
    TextField ID = new TextField();
    ID.setBounds(150, 100, 400, 50);
    add(ID);
    
    Button Get = new Button("Update");
    Get.setBounds(200, 200, 150, 50);
    Get.setBackground(Color.ORANGE);
    add(Get);
    
    Label deleted = new Label("Search was successfull");
    deleted.setBounds(200, 250, 150, 50);
    deleted.setVisible(false);
    add(deleted);
    
    Get.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        deleted.setVisible(true);
    }
    });
    }
    
}
