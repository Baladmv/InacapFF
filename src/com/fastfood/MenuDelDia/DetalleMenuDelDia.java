/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastfood.MenuDelDia;

/**
 *
 * @author proso
 */
public class DetalleMenuDelDia {
    
    int IdDetalleMenu;
    String MenuDelDia;
    String Plato;
    int Stock;
    
    public DetalleMenuDelDia(){
        
    }

    public DetalleMenuDelDia(int IdDetalleMenu, String MenuDelDia, String Plato, int Stock) {
        this.IdDetalleMenu = IdDetalleMenu;
        this.MenuDelDia = MenuDelDia;
        this.Plato = Plato;
        this.Stock = Stock;
    }

    public DetalleMenuDelDia(String MenuDelDia, String Plato, int Stock) {
        this.MenuDelDia = MenuDelDia;
        this.Plato = Plato;
        this.Stock = Stock;
    }

    public int getIdDetalleMenu() {
        return IdDetalleMenu;
    }

    public void setIdDetalleMenu(int IdDetalleMenu) {
        this.IdDetalleMenu = IdDetalleMenu;
    }

    public String getMenuDelDia() {
        return MenuDelDia;
    }

    public void setMenuDelDia(String MenuDelDia) {
        this.MenuDelDia = MenuDelDia;
    }

    public String getPlato() {
        return Plato;
    }

    public void setPlato(String Plato) {
        this.Plato = Plato;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    @Override
    public String toString() {
        return "detallemenudeldia{" + "ID_DetalleMenuDelDia=" + IdDetalleMenu + ", Fk_MenuDelDia=" + MenuDelDia + ", Fk_Plato=" + Plato + ", Stock=" + Stock + '}';
        
    }
    
}
