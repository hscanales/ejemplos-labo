/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hscanales.GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author estudiante
 */
public class Ventana2 extends JPanel {
    private int WIDTH= 300, HEIGHT=300;
    private int widthTF= 120, heightTF=80;
    private int widthBT=60, heightBT=widthBT/2;
    JButton button;
    JTextField textField1,textField2;

    public Ventana2() {
        button = new JButton("Copiear");
        textField1=new JTextField();
        textField2=new JTextField();
        textField2.setBounds(WIDTH/3, 100, widthTF, heightTF);
        textField1.setBounds(WIDTH/3, HEIGHT*2/3, widthTF, heightTF);
        button.setBounds(WIDTH/3, HEIGHT/3-100, widthBT*2, heightBT);
        button.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
          textField2.setText(textField1.getText());
        }
       
        
        });
        textField1.setEditable(true);
        textField2.setEditable(false);
        add(button);
        add(textField1);
        add(textField2);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        
                
    }
    
    
    
}
