/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Login;

import com.fastfood.Orden.VistaOrden;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author proso
 */
public class VistaLogin extends JFrame {

    
    JLabel lblUsuario,lblPass;
    JTextField txtUsuario;
    JPasswordField txtPass;
    JButton btnIngresar;
    
    public VistaLogin(){
        
     this.setTitle("Inicio de Sesion");
     this.setSize(300, 150);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.setLocationRelativeTo(null);
     this.setLayout(new AbsoluteLayout()); 
     
     
     
     lblUsuario=new JLabel("Usuario");
     this.getContentPane().add(lblUsuario,new AbsoluteConstraints(10,10,100,20));
     lblPass=new JLabel("Contraseña");
     this.getContentPane().add(lblPass,new AbsoluteConstraints(10,40,100,20));
     
     txtUsuario=new JTextField();
     this.getContentPane().add(txtUsuario,new AbsoluteConstraints(120, 10,150, 20));
     
     txtPass=new JPasswordField();
     this.getContentPane().add(txtPass,new AbsoluteConstraints(120, 40,150, 20));
    
     btnIngresar=new JButton("Ingresar");
     this.getContentPane().add(btnIngresar,new AbsoluteConstraints(145, 80,100, 20));
     
     this.setVisible(true);
}
}
