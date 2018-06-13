/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author proso
 */
public class conexion {
    
    Connection cx;
    String bd="inacapff";
    String url="jdbc:mysql://localhost:3306/"+bd;
    String user="root";
    String pass="";
            
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cx=(Connection)DriverManager.getConnection(url,user,pass);
            System.out.println("Se conecto");
        } catch (ClassNotFoundException|SQLException ex) {
            System.out.println("No se conecto : " + ex.getMessage());
        }
       return cx;
    }
    
    public void desconectar(){
        try {
            cx.close();
            System.out.println("Se desconecto");
        } catch (SQLException ex) {
            System.out.println("No se desconecto");
        }
    }
    
}
