/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.MenuDelDia;

import com.fastfood.Login.MenuController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import com.fastfood.Plato.Plato;
import com.fastfood.Plato.Categoria;
import com.fastfood.Plato.daoPlato;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author proso
 */
public class MenuDelDiaController implements ActionListener, MouseListener {
    
    MenuDelDiaVista mdv;
    daoMenuDelDia daomd;
    MenuController mc;
    daoPlato daop;
    DetalleMenuDelDia dmd;
    Plato p;
    ArrayList<Plato> lista = null;
    ArrayList<Categoria> catlista = null;
    ArrayList<DetalleMenuDelDia> detlista = null;
    int id = 0;
    String Fecha;
    
    public MenuDelDiaController(){
        
        mdv = new MenuDelDiaVista();
        daomd = new daoMenuDelDia();
        daop = new daoPlato();
        
        mdv.btnAgregar.addActionListener(this);
        mdv.btnEliminar.addActionListener(this);
        mdv.btnLimpiar.addActionListener(this);
        mdv.btnRegresar.addActionListener(this);
        mdv.tblDatos.addMouseListener(this);
        mdv.cboCategoria.addActionListener(this);
        RellenarFecha();
        RellenarCategoria();
        refrescarTabla();
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mdv.btnAgregar) {//Aqui va el codigo para agregar registro
            dmd = new DetalleMenuDelDia();
            dmd.setMenuDelDia(Fecha);
            dmd.setPlato(mdv.cboCategoria.getSelectedItem().toString());
            dmd.setStock(Integer.parseInt(mdv.spnCantidad.getValue().toString()));
            
            if (!daomd.create(dmd)) {
                JOptionPane.showMessageDialog(this.mdv, "No se inserto registro");
            }

            limpiarCampos();
            refrescarTabla();
             
        } 
       if (e.getSource() == mdv.btnEliminar) {//Aqui va el codigo para sliminar registro
            int x = JOptionPane.showConfirmDialog(this.mdv, "ESTAS SEGURO DE ELIMINAR ESTE RESGITRO?");
            if (x == 0 && id > 0) {
                if (!daomd.delete(id)) {
                    JOptionPane.showMessageDialog(this.mdv, "No elimino registro");
                }
            }
             limpiarCampos();
             refrescarTabla();
        }   
        
      if (e.getSource() == mdv.btnRegresar) {
         mdv.setVisible(false);
         mc = new MenuController();
     }
      if (e.getSource() == mdv.cboCategoria) {
         mdv.cboPlato.removeAllItems();
         RellenarPlato();
     } 
      if (e.getSource() == mdv.btnLimpiar) {//Aqui va el codigo para limpiar campos
            limpiarCampos();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if (e.getSource() == mdv.tblDatos) {//Aqui va el codigo para cuando de clic sobre la tabla
            int fila = mdv.tblDatos.getSelectedRow();
            id = Integer.parseInt(mdv.tblDatos.getValueAt(fila, 0).toString());
       }
    }
    
    public void refrescarTabla() {
        while (mdv.model.getRowCount() > 0) {
            mdv.model.removeRow(0);
        }
        detlista = daomd.read(Fecha);
        for (DetalleMenuDelDia dmd : detlista) {
            Object item[] = new Object[3];
            item[0] = dmd.getIdDetalleMenu();
            item[1] = dmd.getPlato();
            item[2] = dmd.getStock();
            mdv.model.addRow(item);
        }
        mdv.tblDatos.setModel(mdv.model);
    }
    public void RellenarFecha(){
      Calendar c = new GregorianCalendar();
      String  dia = Integer.toString(c.get(Calendar.DATE));
      String mes = Integer.toString(c.get(Calendar.MONTH));
      String annio = Integer.toString(c.get(Calendar.YEAR));
      
      mdv.lblFechaDia.setText(dia+"/"+mes+"/"+annio);
      Fecha = dia+"/"+mes+"/"+annio;
    }
    
    public void RellenarCategoria(){
         
         catlista= daop.readCategoria();
         for (Categoria c: catlista){
             mdv.cboCategoria.addItem(c.getNombreCategoria());
         }
        
     }
    
    public void RellenarPlato(){
       
        String Categoria = (mdv.cboCategoria.getSelectedItem().toString());
        daomd.readPlato(Categoria);
        lista = daomd.readPlato(Categoria);
        for (Plato p: lista){
            mdv.cboPlato.addItem(p.getNombrePlato());
        }
    }
    
    public void limpiarCampos() {
        
        mdv.spnCantidad.setValue(0);
        mdv.cboCategoria.setSelectedIndex(0);
       
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
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
