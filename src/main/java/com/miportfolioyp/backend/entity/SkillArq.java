package com.miportfolioyp.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SkillArq {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(length=100)
    private String nombre;
    //capaz hay que poner el numero como string xq tira unos errores 'resueltos' de conversion int/string aca en el output
    private int porcentaje;
    
    
   //----------------------------------

    
    public SkillArq() {
    }

    public SkillArq(String nombre, int porcentaje) {
        
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
    
    //----------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
    
}

