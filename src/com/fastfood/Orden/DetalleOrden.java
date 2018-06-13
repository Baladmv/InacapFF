/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.Orden;

/**
 *
 * @author proso
 */
public class DetalleOrden {
    
    int IdDetalleOrden;
    int Orden;
    String Plato;
    int Cantidad;

    public DetalleOrden(){
        
    }
    public DetalleOrden(int IdDetalleOrden, int Orden, String Plato, int Cantidad) {
        this.IdDetalleOrden = IdDetalleOrden;
        this.Orden = Orden;
        this.Plato = Plato;
        this.Cantidad = Cantidad;
    }

    public DetalleOrden(int Orden, String Plato, int Cantidad) {
        this.Orden = Orden;
        this.Plato = Plato;
        this.Cantidad = Cantidad;
    }

    public int getIdDetalleOrden() {
        return IdDetalleOrden;
    }

    public void setIdDetalleOrden(int IdDetalleOrden) {
        this.IdDetalleOrden = IdDetalleOrden;
    }

    public int getOrden() {
        return Orden;
    }

    public void setOrden(int Orden) {
        this.Orden = Orden;
    }

    public String getPlato() {
        return Plato;
    }

    public void setPlato(String Plato) {
        this.Plato = Plato;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
