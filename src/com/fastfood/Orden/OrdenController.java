/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Orden;
import com.fastfood.MenuDelDia.MenuDelDiaController;

import com.fastfood.Login.MenuController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author proso
 */
public class OrdenController implements ActionListener, MouseListener{
    
    VistaOrden ov;
    daoOrden daoo;
    Orden o;
    MenuController mc;
    MenuDelDiaController mdc;
    ArrayList<Orden> listao = null;
    ArrayList<DetalleOrden> listado = null;
    String Fecha;
    
    
   public OrdenController(){
        ov = new VistaOrden();
        daoo = new daoOrden();
        o = new Orden();
        
        ov.btnRefrescar.addActionListener(this);
        ov.btnEliminar.addActionListener(this);
        ov.btnImprimir.addActionListener(this);
        ov.btnRegresar.addActionListener(this);
        RellenarFecha();
       refrescarTabla();
      
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == ov.btnRefrescar) {
        refrescarTabla();
    }
        
        
        if (e.getSource() == ov.btnRegresar) {
         ov.setVisible(false);
         mc = new MenuController();
     }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }
    
     public void refrescarTabla() {
         System.out.println(Fecha);
        while (ov.model.getRowCount() > 0) {
            ov.model.removeRow(0);
        }
        listao = daoo.read(Fecha);
        for (Orden o : listao) {
            String Platos = null;
            Object item[] = new Object[5];
            item[0] = o.getIdOrden();
            item[1] = o.getHora();
            item[2] = o.getEstado();
            listado = daoo.read(o.getIdOrden());
            for (DetalleOrden Do: listado){
            Platos += Do.getPlato() +" X "+ Do.getCantidad();
            }
            item[3] = Platos;
            item[4] = o.getMonto();
            ov.model.addRow(item);
        }
        ov.tblDatos.setModel(ov.model);
    }
     
     public void RellenarFecha(){
      Calendar c = new GregorianCalendar();
      String  dia = Integer.toString(c.get(Calendar.DATE));
      String mes = Integer.toString(c.get(Calendar.MONTH));
      String annio = Integer.toString(c.get(Calendar.YEAR));
      Fecha = dia+"/"+mes+"/"+annio;
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
