/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Login;

import com.fastfood.MenuDelDia.MenuDelDiaController;
import com.fastfood.Orden.OrdenController;
import com.fastfood.Plato.PlatoController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author proso
 */
public class MenuController implements ActionListener, MouseListener {
    
    VistaMenu m;
    PlatoController pc;
    OrdenController oc;
    MenuDelDiaController mdco;
    
    
    public MenuController(){
         m = new VistaMenu();
         m.btnMenuDelDia.addActionListener(this);
         m.btnPlatos.addActionListener(this);
         m.btnOrdenes.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == m.btnMenuDelDia) {//Aqui va el codigo para agregar registro
        m.setVisible(false); 
        mdco = new MenuDelDiaController();
    }
      if (e.getSource() == m.btnPlatos) {
        m.setVisible(false); 
        pc = new PlatoController();
    }
      if (e.getSource() == m.btnOrdenes) {//Aqui va el codigo para agregar registro
         m.setVisible(false);
         oc = new OrdenController();
         
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
