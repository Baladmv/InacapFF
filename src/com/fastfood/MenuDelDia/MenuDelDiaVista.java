/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.MenuDelDia;
import java.util.ArrayList;

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
public class MenuDelDiaVista extends JFrame{
    
    JLabel lblFecha, lblFechaDia, lblCategoria, lblPlato, lblCantidad;
    JSpinner spnCantidad;
    JComboBox cboCategoria, cboPlato;
    JScrollPane scroll;
    DefaultTableModel model;
    JTable tblDatos;
    JButton btnAgregar,btnEliminar,btnLimpiar,btnRegresar;
    
    public MenuDelDiaVista(){
        
   
    int x = 0; 
        
     this.setTitle("Menu Del Dia");
     this.setSize(532, 480);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.setLocationRelativeTo(null);
     this.setLayout(new AbsoluteLayout());
     
     lblFecha=new JLabel("Fecha");
     this.getContentPane().add(lblFecha,new AbsoluteConstraints(10,10,100,20));
     lblCategoria=new JLabel("Categoria");
     this.getContentPane().add(lblCategoria,new AbsoluteConstraints(10,40,100,20));
     lblPlato=new JLabel("Plato");
     this.getContentPane().add(lblPlato,new AbsoluteConstraints(10,70,100,20));
     lblCantidad=new JLabel("Cantidad");
     this.getContentPane().add(lblCantidad,new AbsoluteConstraints(10,100,100,20));
     
     lblFechaDia=new JLabel("Fecha");
     this.getContentPane().add(lblFechaDia,new AbsoluteConstraints(120,10,100,20));
     
     cboCategoria=new JComboBox();
     this.getContentPane().add(cboCategoria,new AbsoluteConstraints(120, 40,100, 20));
     
     cboPlato=new JComboBox();
     this.getContentPane().add(cboPlato,new AbsoluteConstraints(120, 70,100, 20));
     
     spnCantidad=new JSpinner();
     this.getContentPane().add(spnCantidad,new AbsoluteConstraints(120, 100,100, 20));
      

     
     btnAgregar=new JButton("Agregar");
     this.getContentPane().add(btnAgregar,new AbsoluteConstraints(300, 10,100, 20));
     btnEliminar=new JButton("Eliminar");
     this.getContentPane().add(btnEliminar,new AbsoluteConstraints(300, 40,100, 20));
     btnLimpiar=new JButton("Limpiar");
     this.getContentPane().add(btnLimpiar,new AbsoluteConstraints(300, 70,100, 20));
     btnRegresar=new JButton("Regresar");
     this.getContentPane().add(btnRegresar,new AbsoluteConstraints(300, 100,100, 20));
     
     
        tblDatos=new JTable();
        scroll=new JScrollPane();
        model=new  DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Plato");
        model.addColumn("Stock");
        tblDatos.setModel(model);
        scroll.setViewportView(tblDatos);
        this.getContentPane().add(scroll,new AbsoluteConstraints(10, 130,500, 300));
        this.setVisible(true);
    }
    
}
