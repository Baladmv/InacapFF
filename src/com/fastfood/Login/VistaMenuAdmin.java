/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Login;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author proso
 */
public class VistaMenuAdmin extends JFrame {
    
    JButton btnMenuDelDia, btnPlatos, btnOrdenes;
    
    public VistaMenuAdmin(){
        
     this.setTitle("Menu");
     this.setSize(300, 400);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.setLocationRelativeTo(null);
     this.setLayout(new AbsoluteLayout()); 
     
     btnMenuDelDia=new JButton("Menu Del Dia");
     this.getContentPane().add(btnMenuDelDia,new AbsoluteConstraints(50, 50,200, 50));
     btnPlatos=new JButton("Platos");
     this.getContentPane().add(btnPlatos,new AbsoluteConstraints(50, 150,200, 50));
     btnOrdenes=new JButton("Ordenes");
     this.getContentPane().add(btnOrdenes,new AbsoluteConstraints(50, 250,200, 50));
     
        this.setVisible(true);
        
    }
    
}
