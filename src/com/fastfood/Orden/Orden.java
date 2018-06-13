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
public class Orden {
    
    int IdOrden;
    String Fecha; 
    String Hora;
    int Cliente;
    String Estado;
    String MedioDePago;
    int Monto;

    
    public Orden(){
        System.out.println("Orden");
        
    }
    
    public Orden(String Fecha, String Hora, int Cliente, String Estado, String MedioDePago , int Monto) {
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Cliente = Cliente;
        this.Estado = Estado;
        this.MedioDePago = MedioDePago;
        this.Monto = Monto;
    }
    
   
    public Orden(int IdOrden, String Fecha, String Hora, int Cliente, String Estado, String MedioDePago, int Monto) {
        this.IdOrden = IdOrden;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Cliente = Cliente;
        this.Estado = Estado;
        this.MedioDePago = MedioDePago;
        this.Monto = Monto;
    }

    
    
    public int getIdOrden() {
        return IdOrden;
    }

    public void setIdOrden(int IdOrden) {
        this.IdOrden = IdOrden;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public int getCliente() {
        return Cliente;
    }

    public void setCliente(int Cliente) {
        this.Cliente = Cliente;
    }


    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getMedioDePago() {
        return MedioDePago;
    }

    public void setMedioDePago(String MedioDePago) {
        this.MedioDePago = MedioDePago;
    }
    
    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }
    
    @Override
    public String toString() {
        return "Orden{" + "ID_Orden=" + IdOrden + ", Fecha=" + Fecha + ", Hora=" + Hora + ", Fk_Cliente=" + Cliente + ", Fk_Estado=" + Estado + ",Fk_MedioDePago" + MedioDePago + ", MontoTotal" + Monto + '}';
    }
           
}
