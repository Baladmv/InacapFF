/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.MenuDelDia;

import com.connection.conexion;
import com.fastfood.Plato.Plato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author proso
 */
public class daoMenuDelDia {
     conexion c;

    public daoMenuDelDia() {
        c = new conexion();
    }
    
    public boolean create(DetalleMenuDelDia dm) {
        try {
            String sql = "INSERT INTO detallemenudeldia(Fk_MenuDelDia,Fk_Plato,Stock) VALUES(?,?,?)";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1, dm.getMenuDelDia());
            ps.setString(2, dm.getPlato());
            ps.setInt(3, dm.getStock());
            ps.execute();
            ps.close();
            ps=null;
            c.desconectar();
            return true;
        } catch (SQLException ex) {
            System.out.println("No se inserto registro" + ex.getMessage());
            return false;
        }
    }
    
    public ArrayList<DetalleMenuDelDia> read(String Fecha) {
        ArrayList<DetalleMenuDelDia> lista = new ArrayList<DetalleMenuDelDia>();
        try {
            String sql = "SELECT * FROM detalleMenuDelDia WHERE FK_MenuDelDia =?";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1, Fecha);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetalleMenuDelDia dm = new DetalleMenuDelDia();
                dm.setIdDetalleMenu(rs.getInt("ID_DetalleMenuDelDia"));
                dm.setMenuDelDia(rs.getString("Fk_MenuDelDia"));
                dm.setPlato(rs.getString("Fk_Plato"));
                dm.setStock(rs.getInt("Stock"));
                lista.add(dm);
            }
            ps.close();
            ps = null;
            c.desconectar();
        } catch (SQLException ex) {
            System.out.println("Fallo metodo read" + ex.getMessage());
        }
        return lista;
    }
        
        public boolean delete(int id) {
        try {
            String sql = "DELETE FROM detallemenudeldia WHERE ID_DetalleMenuDelDia =?";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            ps = null;
            c.desconectar();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    
       
    }
    
    
     public ArrayList<Plato> readPlato(String Categoria) {
        ArrayList<Plato> lista = new ArrayList<Plato>();
        try {
            String sql = "SELECT * FROM plato WHERE Fk_Categoria=?";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1, Categoria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Plato p = new Plato();
                p.setIdPlato(rs.getInt("ID_Plato"));
                p.setNombrePlato(rs.getString("NombrePlato"));
                p.setDetalle(rs.getString("Descripcion"));
                p.setPrecio(rs.getInt("Precio"));
                p.setCategoria(rs.getString("Fk_Categoria"));
                lista.add(p);
            }
            ps.close();
            ps = null;
            c.desconectar();
        } catch (SQLException ex) {
            System.out.println("Fallo metodo readCategoria");
        }
        return lista;
    }
}
