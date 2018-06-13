/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Plato;



import com.fastfood.Login.MenuController;
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
public class PlatoController implements ActionListener, MouseListener {

    VistaPlato v;
    Plato p, p1;
    Categoria c;
    CategoriaController cc;
    daoPlato dao;
    MenuController mc;
    int id = 0;
    ArrayList<Plato> lista = null;
    ArrayList<Categoria> catlista = null;

    
    
 public PlatoController() {
        v = new VistaPlato();
        dao = new daoPlato();
        p1 = new Plato();
        //Plato
        v.btnAgregar.addActionListener(this);
        v.btnEliminar.addActionListener(this);
        v.btnGuardar.addActionListener(this);
        v.btnCategoria.addActionListener(this);
        v.btnRegresar.addActionListener(this);
        v.tblDatos.addMouseListener(this);
        //Categoria
                
        refrescarTabla();
        RellenarCategorias();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == v.btnAgregar) {//Aqui va el codigo para agregar registro
            p = new Plato();
            p.setNombrePlato(v.txtNombre.getText());
            p.setDetalle(v.txtDetalle.getText());
            p.setPrecio(Integer.parseInt(v.spnPrecio.getValue().toString()));
            p.setCategoria(v.cboCategoria.getSelectedItem().toString());
            if (!dao.create(p)) {
                JOptionPane.showMessageDialog(this.v, "No se inserto registro");
            }

            limpiarCampos();
             refrescarTabla();
             
        } 
       if (e.getSource() == v.btnEliminar) {//Aqui va el codigo para sliminar registro
            int x = JOptionPane.showConfirmDialog(this.v, "ESTAS SEGURO DE ELIMINAR ESTE RESGITRO?");
            if (x == 0 && id > 0) {
                if (!dao.delete(id)) {
                    JOptionPane.showMessageDialog(this.v, "No elimino registro");
                }
            }
             refrescarTabla();
        }
     if (e.getSource() == v.btnGuardar) {//Aqui va el codigo para editar registro
            p1.setNombrePlato(v.txtNombre.getText());
            p1.setPrecio(Integer.parseInt(v.spnPrecio.getValue().toString()));
            p1.setDetalle(v.txtDetalle.getText());
            p1.setCategoria(v.cboCategoria.getSelectedItem().toString());
            if (!dao.update(p1)) {
                JOptionPane.showMessageDialog(this.v, "No se actualizo registro");
            }
            refrescarTabla();
        }
    
     if (e.getSource() == v.btnCategoria) {//Aqui va el codigo para limpiar campos
         v.setVisible(false);
         cc = new CategoriaController();
        }
     
     
     
     if (e.getSource() == v.btnRegresar) {
         
         v.setVisible(false);
         mc = new MenuController();
     }
     //Categoria
     
     
    
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == v.tblDatos) {//Aqui va el codigo para cuando de clic sobre la tabla
            int fila = v.tblDatos.getSelectedRow();
            id = Integer.parseInt(v.tblDatos.getValueAt(fila, 0).toString());
            p1 = dao.read(id);
            v.lblIdproducto.setText("" + p1.getIdPlato());
            v.txtNombre.setText(p1.getNombrePlato());
              v.txtDetalle.setText(p1.getDetalle());
            v.spnPrecio.setValue(p1.getPrecio());
            v.cboCategoria.setSelectedItem(p1.getCategoria());
        }
        
    }
    
     public void refrescarTabla() {
        while (v.model.getRowCount() > 0) {
            v.model.removeRow(0);
        }
        lista = dao.read();
        for (Plato p : lista) {
            Object item[] = new Object[5];
            item[0] = p.getIdPlato();
            item[1] = p.getNombrePlato();
            item[2] = p.getDetalle();
            item[3] = p.getPrecio();
            item[4] = p.getCategoria();
            v.model.addRow(item);
        }
        v.tblDatos.setModel(v.model);
    }
     
     public void RellenarCategorias(){
         
         catlista= dao.readCategoria();
         for (Categoria c: catlista){
             v.cboCategoria.addItem(c.getNombreCategoria());
         }
        
     }

    public void limpiarCampos() {
        v.txtNombre.setText("");
        v.spnPrecio.setValue(0);
        v.txtDetalle.setText("");
        v.cboCategoria.setSelectedIndex(0);
        v.lblIdproducto.setText("");
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
   