/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Plato;
import com.connection.conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author proso
 */
public class daoPlato {
    
    conexion c;

    public daoPlato() {
        c = new conexion();
    }

    public boolean create(Plato p) {
        try {
            String sql = "INSERT INTO plato(NombrePlato,Descripcion,Precio,Fk_Categoria) VALUES(?,?,?,?)";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1, p.getNombrePlato());
            ps.setString(2, p.getDetalle());
            ps.setInt(3, p.getPrecio());
            ps.setString(4, p.getCategoria());
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
    public ArrayList<Plato> read() {
        ArrayList<Plato> lista = new ArrayList<Plato>();
        try {
            String sql = "SELECT * FROM plato";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
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
            System.out.println("Fallo metodo read");
        }
        return lista;
    }
        
        public boolean delete(int id) {
        try {
            String sql = "DELETE FROM plato WHERE ID_Plato=?";
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
        public boolean update(Plato p) {
        try {
            String sql = "UPDATE plato SET NombrePlato=?,Descripcion=?,Precio=?,Fk_Categoria=? WHERE ID_Plato=?";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1, p.getNombrePlato()); 
            ps.setString(2, p.getDetalle());
            ps.setInt(3, p.getPrecio());
            ps.setString(4, p.getCategoria());
            ps.setInt(5, p.getIdPlato());
            ps.execute();
            ps.close();
            ps=null;
            c.desconectar();
            return true;
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
            return false;
        }        
    }
         
         public Plato read(int id) {
       Plato p=new Plato();
        try {
            String sql = "SELECT * FROM plato WHERE ID_Plato=?";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p.setIdPlato(rs.getInt("ID_Plato"));
                p.setNombrePlato(rs.getString("NombrePlato"));
                p.setDetalle(rs.getString("Descripcion"));
                p.setPrecio(rs.getInt("Precio"));
                p.setCategoria(rs.getString("Fk_Categoria"));
            }
            ps.close();
            ps = null;
            c.desconectar();
        } catch (SQLException ex) {
            System.out.println("Fallo metodo read prodcuto");
        }
        return p;
    }
     
         public ArrayList<Categoria> readCategoria() {
        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        try {
            String sql = "SELECT * FROM Categoria";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categoria c = new Categoria();
                c.setIdCategoria(rs.getInt("ID_Categoria"));
                c.setNombreCategoria(rs.getString("NombreCategoria"));
                lista.add(c);
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

