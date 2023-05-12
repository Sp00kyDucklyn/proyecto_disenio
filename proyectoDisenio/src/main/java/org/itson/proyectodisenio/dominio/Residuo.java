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
public class Residuo {
    private ObjectId id;
    private int codigo;
    private String tipo;
    private String descripcion;
    private Productor productor;
    
    public Residuo(){
        
    }

    public Residuo(ObjectId id, int codigo, String tipo, String descripcion, Productor productor) {
        this.id = id;
        this.codigo = codigo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.productor = productor;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Productor getProductor() {
        return productor;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }
    
    
}
