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
public class Empresa_transportista {
    private ObjectId id;
    private int traslados_totales;
    
    public Empresa_transportista(){
        
    }

    public Empresa_transportista(ObjectId id, int traslados_totales) {
        this.id = id;
        this.traslados_totales = traslados_totales;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getTraslados_totales() {
        return traslados_totales;
    }

    public void setTraslados_totales(int traslados_totales) {
        this.traslados_totales = traslados_totales;
    }
    
    
}
