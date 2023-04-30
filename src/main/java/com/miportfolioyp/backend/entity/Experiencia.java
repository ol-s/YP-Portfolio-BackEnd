package com.miportfolioyp.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)                     
    private int id;
    
    @Column(length=100)
    private String rubro;
    
    @Lob
    //@Column(length=800)
    private String logoLugar;
    
    @Column(length=100)
    private String lugar;
    
    @Column(length=100)
    private String puesto;
    
    @Column(name="descripcion", length=800)
    private String descripcion;
    
    private String fechaInicio;
    private String fechaFin;     
       
       
    //----------------------------------------------------------------
    public Experiencia() {
    }

    public Experiencia(String rubro, String logoLugar, String lugar, String puesto, String descripcion, String fechaInicio, String fechaFin) {
        this.rubro = rubro;
        this.logoLugar = logoLugar;
        this.lugar = lugar;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

   //----------------------------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getLogoLugar() {
        return logoLugar;
    }

    public void setLogoLugar(String logoLugar) {
        this.logoLugar = logoLugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
       
    
}
