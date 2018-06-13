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
public class Plato {
    
    int IdPlato;
    String NombrePlato;
    String Detalle;
    int Precio;
    String Categoria;
    
    public Plato(){
        
        System.out.println("Se creo Plato");
    }

    public Plato(int IdPlato, String NombrePlato, String Detalle, int Precio, String Categoria) {
        this.IdPlato = IdPlato;
        this.NombrePlato = NombrePlato;
        this.Detalle = Detalle;
        this.Precio = Precio;
        this.Categoria = Categoria;
    }

    public Plato(String NombrePlato, String Detalle, int Precio, String Categoria) {
        this.NombrePlato = NombrePlato;
        this.Detalle = Detalle;
        this.Precio = Precio;
        this.Categoria = Categoria;
    }

    public int getIdPlato() {
        return IdPlato;
    }

    public void setIdPlato(int IdPlato) {
        this.IdPlato = IdPlato;
    }

    public String getNombrePlato() {
        return NombrePlato;
    }

    public void setNombrePlato(String NombrePlato) {
        this.NombrePlato = NombrePlato;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    @Override
    public String toString() {
        return "plato{" + "ID_Plato=" + IdPlato + ", NombrePlato=" + NombrePlato + ", Descripcion=" + Detalle + ", Precio=" + Precio + ", Fk_Categoria=" + Categoria + '}';
    }
    


}
