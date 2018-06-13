/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Plato;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.*;

/**
 *
 * @author proso
 */
public class VistaPlato extends JFrame{
    
    JLabel lblId,lblNombre,lblPrecio,lblDetalle,lblCategoria,lblIdproducto;
    JTextField txtNombre, txtDetalle;
    JSpinner spnPrecio;
    JComboBox cboCategoria;
    JScrollPane scroll;
    DefaultTableModel model;
    JTable tblDatos;
    JButton btnAgregar,btnEliminar,btnGuardar,btnCategoria,btnRegresar;
    
    public VistaPlato(){
        
     this.setTitle("Platos");
     this.setSize(532, 550);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.setLocationRelativeTo(null);
     this.setLayout(new AbsoluteLayout());
     
     lblId=new JLabel("ID Producto");
     this.getContentPane().add(lblId,new AbsoluteConstraints(10,10,100,20));
     lblNombre=new JLabel("Nombre");
     this.getContentPane().add(lblNombre,new AbsoluteConstraints(10,40,100,20));
     lblDetalle=new JLabel("Detalle");
     this.getContentPane().add(lblDetalle,new AbsoluteConstraints(10,70,100,20));
      lblCategoria=new JLabel("Categoria");
     this.getContentPane().add(lblCategoria,new AbsoluteConstraints(10,100,100,20));
     lblPrecio=new JLabel("Precio");
     this.getContentPane().add(lblPrecio,new AbsoluteConstraints(10,130,100,20));
    
     
     
     lblIdproducto=new JLabel("ID ");
     this.getContentPane().add(lblIdproducto,new AbsoluteConstraints(120,10,100,20));

     txtNombre=new JTextField();
     this.getContentPane().add(txtNombre,new AbsoluteConstraints(120, 40,100, 20));
         
     txtDetalle=new JTextField();
     this.getContentPane().add(txtDetalle,new AbsoluteConstraints(120, 70,100, 20));
      
     cboCategoria=new JComboBox();
     this.getContentPane().add(cboCategoria,new AbsoluteConstraints(120, 100,100, 20));
     
     spnPrecio=new JSpinner();
     this.getContentPane().add(spnPrecio,new AbsoluteConstraints(120, 130,100, 20));

     
     btnAgregar=new JButton("Agregar");
     this.getContentPane().add(btnAgregar,new AbsoluteConstraints(300, 10,100, 20));
     btnEliminar=new JButton("Eliminar");
     this.getContentPane().add(btnEliminar,new AbsoluteConstraints(300, 40,100, 20));
     btnGuardar=new JButton("Guardar");
     this.getContentPane().add(btnGuardar,new AbsoluteConstraints(300, 70,100, 20));
     btnCategoria=new JButton("Categoria");
     this.getContentPane().add(btnCategoria,new AbsoluteConstraints(300, 100,100, 20));
     btnRegresar=new JButton("Regresar");
     this.getContentPane().add(btnRegresar,new AbsoluteConstraints(300, 130,100, 20));
     
        tblDatos=new JTable();
        scroll=new JScrollPane();
        model=new  DefaultTableModel();
        model.addColumn("Id Producto");
        model.addColumn("Nombre");
        model.addColumn("Detalle");
        model.addColumn("Precio");
        model.addColumn("Categoria");
        tblDatos.setModel(model);
        scroll.setViewportView(tblDatos);
        this.getContentPane().add(scroll,new AbsoluteConstraints(10, 200,500, 300));
        this.setVisible(true);
}
 
}