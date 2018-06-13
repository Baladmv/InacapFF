/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Plato;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author proso
 */
public class VistaCategoria extends JFrame {
    
    JLabel lblId,lblNombre,lblIdC;
    JTextField txtNombre;
    JButton btnAgregar,btnEliminar,btnRegresar;
    JScrollPane scroll;
    DefaultTableModel model;
    JTable tblDatos;
    
    public VistaCategoria(){
        
     this.setTitle("Categoria");
     this.setSize(420, 480);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.setLocationRelativeTo(null);
     this.setLayout(new AbsoluteLayout());
     
     lblId=new JLabel("ID Producto");
     this.getContentPane().add(lblId,new AbsoluteConstraints(10,10,100,20));
     lblNombre=new JLabel("Nombre");
     this.getContentPane().add(lblNombre,new AbsoluteConstraints(10,40,100,20));
     
     
     lblIdC=new JLabel();
     this.getContentPane().add(lblIdC,new AbsoluteConstraints(120,10,100,20));
     txtNombre=new JTextField();
     this.getContentPane().add(txtNombre,new AbsoluteConstraints(120, 40,100, 20));
     
     btnAgregar=new JButton("Agregar");
     this.getContentPane().add(btnAgregar,new AbsoluteConstraints(250, 10,100, 20));
     btnEliminar=new JButton("Eliminar");
     this.getContentPane().add(btnEliminar,new AbsoluteConstraints(250, 40,100, 20));
     btnRegresar=new JButton("Regresar");
     this.getContentPane().add(btnRegresar,new AbsoluteConstraints(250, 70,100, 20));
      tblDatos=new JTable();
        scroll=new JScrollPane();
        model=new  DefaultTableModel();
        model.addColumn("Id Categoria");
        model.addColumn("Nombre");
        tblDatos.setModel(model);
        scroll.setViewportView(tblDatos);
        this.getContentPane().add(scroll,new AbsoluteConstraints(10, 130,380, 300));
     
     
     this.setVisible(true);
    }
}
