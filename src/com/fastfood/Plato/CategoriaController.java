/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Plato;

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
public class CategoriaController implements ActionListener, MouseListener {
    
    VistaCategoria cv;
    PlatoController pc;
    Categoria c;
    daoCategoria daoC;
    int id = 0;
     ArrayList<Categoria> listac = null;
    
    CategoriaController(){
        cv = new VistaCategoria();
        c = new Categoria();
        daoC = new daoCategoria();
        
        cv.btnAgregar.addActionListener(this);
        cv.btnEliminar.addActionListener(this);
        cv.btnRegresar.addActionListener(this);
        cv.tblDatos.addMouseListener(this);
        
        refrescarTabla();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()== cv.btnAgregar){
         c = new Categoria();
         c.setNombreCategoria(cv.txtNombre.getText());
           if (!daoC.create(c)) {
                JOptionPane.showMessageDialog(this.cv, "No se inserto registro");
            }
            refrescarTabla();
     }
     
     if (e.getSource()== cv.btnEliminar){
          int x = JOptionPane.showConfirmDialog(this.cv, "ESTAS SEGURO DE ELIMINAR ESTE RESGITRO?");
            if (x == 0 && id > 0) {
                if (!daoC.delete(id)) {
                    JOptionPane.showMessageDialog(this.cv, "No elimino registro");
                }
            }
             refrescarTabla();
     }
     if (e.getSource()== cv.btnRegresar){
         cv.setVisible(false);
         pc = new PlatoController();
     }
     
            
     }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == cv.tblDatos) {//Aqui va el codigo para cuando de clic sobre la tabla
            int fila = cv.tblDatos.getSelectedRow();
            id = Integer.parseInt(cv.tblDatos.getValueAt(fila, 0).toString());
        }
       
    }
    
    public void refrescarTabla() {
        while (cv.model.getRowCount() > 0) {
            cv.model.removeRow(0);
        }
        listac = daoC.read();
        for (Categoria c : listac) {
            Object item[] = new Object[5];
            item[0] = c.getIdCategoria();
            item[1] = c.getNombreCategoria();
            cv.model.addRow(item);
        }
        cv.tblDatos.setModel(cv.model);
    }

    @Override
    public void mousePressed(MouseEvent me) {
  
    }

    @Override
    public void mouseReleased(MouseEvent me) {
     
    }

    @Override
    public void mouseEntered(MouseEvent me) {
  
    }

    @Override
    public void mouseExited(MouseEvent me) {
     
    }
    
}
