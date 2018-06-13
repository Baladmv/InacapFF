/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Login;

import com.connection.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author proso
 */
public class daoUsuario {
    
    conexion c;

    public daoUsuario() {
        c = new conexion();
    }
    
    public Usuario read(String NombreUsuario) {
       Usuario p=new Usuario();
        try {
            String sql = "SELECT * FROM administrador WHERE Nombre=? ";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1, NombreUsuario);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p.setIdUsuario(rs.getInt("ID_Administrador"));
                p.setNombreUsuario(rs.getString("Nombre"));
                p.setApellidoUsuario(rs.getString("Apellido"));
                p.setContraseña(rs.getString("Contraseña"));
                p.setCorreo(rs.getString("Correo"));
            }
            ps.close();
            ps = null;
            c.desconectar();
        } catch (SQLException ex) {
            System.out.println("Fallo metodo read Usuario" + ex.getMessage());
        }
        return p;
    }
}
