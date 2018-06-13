/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Orden;

import com.connection.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author proso
 */
public class daoOrden {
    
     conexion c;

    public daoOrden() {
        c = new conexion();
    }
    
     public ArrayList<Orden> read(String Fecha) {
        ArrayList<Orden> listaO = new ArrayList<Orden>();
        try {
            String sql = "SELECT ID_Orden, Fecha, Hora, Fk_Estado, MontoTotal FROM orden WHERE Fecha=?";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1, Fecha);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Orden o = new Orden();
                o.setIdOrden(rs.getInt("ID_Orden"));
                o.setFecha(rs.getString("Fecha"));
                o.setHora(rs.getString("Hora"));
                o.setEstado(rs.getString("Fk_Estado"));
                o.setMonto(rs.getInt("MontoTotal"));
                listaO.add(o);
            }
            ps.close();
            ps = null;
            c.desconectar();
        } catch (SQLException ex) {
            System.out.println("Fallo metodo read"+ ex.getMessage());
        }
        return listaO;
    }
     
     public ArrayList<DetalleOrden> read(int Id) {
        ArrayList<DetalleOrden> listaDO = new ArrayList<DetalleOrden>();
        try {
            String sql = "SELECT * FROM detalleOrden WHERE Fk_Orden=?";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetalleOrden Do = new DetalleOrden();
                
                Do.setIdDetalleOrden(rs.getInt("ID_DetalleOrden"));
                Do.setOrden(rs.getInt("Fk_Orden"));
                Do.setPlato(rs.getString("Fk_Plato"));
                Do.setCantidad(rs.getInt("Cantidad"));
                listaDO.add(Do);
            }
            ps.close();
            ps = null;
            c.desconectar();
        } catch (SQLException ex) {
            System.out.println("Fallo metodo read"+ ex.getMessage());
        }
        return listaDO;
    }
    
}
