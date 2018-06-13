/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Login;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author proso
 */
public class LoginController implements ActionListener, MouseListener {
    
    VistaLogin l;
    Usuario U, Ul;
    daoUsuario daoU;
    MenuController pc;
   ArrayList<Usuario> lista = null;
    
    
     public LoginController(){
         l = new VistaLogin();
         daoU = new daoUsuario();
         l.btnIngresar.addActionListener(this);
         
         
     }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == l.btnIngresar) {
          
            String User = l.txtUsuario.getText();
            String Pass = l.txtPass.getText();
            Ul = daoU.read(User);
            
            String b = Ul.getNombreUsuario();
            String c = Ul.getContraseña();
            String d = Ul.getApellidoUsuario();
            
        
            if (User == null ? b == null : User.equals(b)){
                
                if(Pass == null ? c == null : Pass.equals(c)){
                    
                    
                l.setVisible(false);
                JOptionPane.showMessageDialog(this.l, "Bienvenido " + b +" " + d);
                pc = new MenuController();
                    
                }else{
                    JOptionPane.showMessageDialog(this.l, "Contraseña Incorrecta");
                }
                
            }else{
                JOptionPane.showMessageDialog(this.l, "Este Usuario no esta Registrado");
            }
            
        
            
        } 
      
      
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
