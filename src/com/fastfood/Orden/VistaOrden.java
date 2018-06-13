/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Orden;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
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
public class VistaOrden extends JFrame {
    
    JScrollPane scroll;
    DefaultTableModel model;
    JTable tblDatos;
    JButton btnRefrescar ,btnEliminar, btnImprimir, btnRegresar;
    
    public VistaOrden(){
        
     this.setTitle("Ordenes");
     this.setSize(1200, 600);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.setLocationRelativeTo(null);
     this.setLayout(new AbsoluteLayout()); 
      
     btnRefrescar=new JButton("Refrescar Lista");
     this.getContentPane().add(btnRefrescar,new AbsoluteConstraints(10, 10, 150, 40));
     btnEliminar=new JButton("Eliminar Orden");
     this.getContentPane().add(btnEliminar,new AbsoluteConstraints(240, 10, 150, 40));
     btnImprimir=new JButton("Imprimir Orden");
     this.getContentPane().add(btnImprimir,new AbsoluteConstraints(471, 10,150, 40));
     btnRegresar=new JButton("Regresar");
     this.getContentPane().add(btnRegresar,new AbsoluteConstraints(702, 10,150, 40));
     
        tblDatos=new JTable();
        scroll=new JScrollPane();
        model=new  DefaultTableModel();
        model.addColumn("Id Orden");
        model.addColumn("Hora");
        model.addColumn("Estado");
        model.addColumn("Platos");
        model.addColumn("MontoTotal");
        tblDatos.setModel(model);
        scroll.setViewportView(tblDatos);
        this.getContentPane().add(scroll,new AbsoluteConstraints(10, 60, 1160, 490));
        this.setVisible(true);
    }
    
   
    
}
