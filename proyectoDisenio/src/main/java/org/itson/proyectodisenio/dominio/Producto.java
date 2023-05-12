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
public class Producto {
    private ObjectId id;
    private Residuo residuo;
    
    public Producto(){
        
    }

    public Producto(ObjectId id, Residuo residuo) {
        this.id = id;
        this.residuo = residuo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }
    
    
}
