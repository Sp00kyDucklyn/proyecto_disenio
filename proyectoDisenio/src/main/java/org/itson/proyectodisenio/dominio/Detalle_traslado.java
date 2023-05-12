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
public class Detalle_traslado {
    private ObjectId id;
    private int numeroVehiculos;
    private int totalProductos;
    
    public Detalle_traslado(){
        
    }

    public Detalle_traslado(ObjectId id, int numeroVehiculos, int totalProductos) {
        this.id = id;
        this.numeroVehiculos = numeroVehiculos;
        this.totalProductos = totalProductos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public void setNumeroVehiculos(int numeroVehiculos) {
        this.numeroVehiculos = numeroVehiculos;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }
    
    
}
