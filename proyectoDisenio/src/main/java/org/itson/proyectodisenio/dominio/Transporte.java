/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.proyectodisenio.dominio;

import org.bson.types.ObjectId;

/**
 *
 * @author hoshi
 */
public class Transporte {
    private ObjectId id;
    private Producto producto;
    private String destino;
    private String vehiculo;
    private float costoV;
    
    public Transporte(){
        
    }

    public Transporte(ObjectId id, Producto producto, String destino, String vehiculo, float costoV) {
        this.id = id;
        this.producto = producto;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.costoV = costoV;
    }

    public float getCostoV() {
        return costoV;
    }

    public void setCostoV(float costoV) {
        this.costoV = costoV;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
}
