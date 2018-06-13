/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Login;

/**
 *
 * @author proso
 */
public class Usuario {
    
    int IdUsuario;
    String NombreUsuario;
    String ApellidoUsuario;
    String Contraseña;
    String Correo;
    
    public Usuario(){
        System.out.println("Usuario");
    }

    public Usuario(int IdUsuario, String NombreUsuario, String ApellidoUsuario, String Contraseña, String Correo) {
        this.IdUsuario = IdUsuario;
        this.NombreUsuario = NombreUsuario;
        this.ApellidoUsuario = ApellidoUsuario;
        this.Contraseña = Contraseña;
        this.Correo = Correo;
    }

    public Usuario(String NombreUsuario, String ApellidoUsuario, String Contraseña, String Correo) {
        this.NombreUsuario = NombreUsuario;
        this.ApellidoUsuario = ApellidoUsuario;
        this.Contraseña = Contraseña;
        this.Correo = Correo;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getApellidoUsuario() {
        return ApellidoUsuario;
    }

    public void setApellidoUsuario(String ApellidoUsuario) {
        this.ApellidoUsuario = ApellidoUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
    
     
            
    
}
