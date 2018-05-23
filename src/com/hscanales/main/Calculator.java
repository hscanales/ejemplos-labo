/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hscanales.main;

import com.hscanales.GUI.Ventana2;
import javax.swing.JFrame;

/**
 *
 * @author estudiante
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame ventana= new JFrame ( "Mi ventana");
        ventana.setContentPane(new Ventana2());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(true);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    
}
