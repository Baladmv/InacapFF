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
public class daoCategoria {
    
    conexion c;

    public daoCategoria() {
        c = new conexion();
    }
    
     public boolean create(Categoria ca) {
        try {
            String sql = "INSERT INTO categoria(NombreCategoria) VALUES(?)";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1, ca.getNombreCategoria());
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
    public ArrayList<Categoria> read() {
        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        try {
            String sql = "SELECT * FROM categoria";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categoria ca = new Categoria();
                ca.setIdCategoria(rs.getInt("ID_Categoria"));
                ca.setNombreCategoria(rs.getString("NombreCategoria"));
                lista.add(ca);
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
            String sql = "DELETE FROM categoria WHERE ID_Categoria=?";
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

    
}
