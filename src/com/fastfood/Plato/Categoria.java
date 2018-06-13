/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Plato;

/**
 *
 * @author proso
 */
public class Categoria {
    
   int IdCategoria;
   String NombreCategoria;
    
   public Categoria(){
       
   }

    public Categoria(int IdCategoria, String NombreCategoria) {
        this.IdCategoria = IdCategoria;
        this.NombreCategoria = NombreCategoria;
    }

    public Categoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }
   
   
           
}
