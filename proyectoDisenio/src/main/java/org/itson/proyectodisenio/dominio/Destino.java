/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.proyectodisenio.dominio;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author hoshi
 */
public class Destino {
    private ObjectId id;
    private Date fecha_llegada;
    private String nombre;
    private String tratamiento;
    
    public Destino(){
        
    }

    public Destino(ObjectId id, Date fecha_llegada, String nombre, String tratamiento) {
        this.id = id;
        this.fecha_llegada = fecha_llegada;
        this.nombre = nombre;
        this.tratamiento = tratamiento;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(Date fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
}
