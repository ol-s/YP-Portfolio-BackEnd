package com.miportfolioyp.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    
    @Lob
    //@Column(name="logoInstitucion")
    private String logoInstitucion;
    
    @Column(length=50)
    private String logoAlt;
    
    private String anioeInstitucion;
    
    private String titulo;    
    
    private String descripcion;
    
    //---------------------------------------------------------------
        public Educacion() {
    }
               
    public Educacion(String logoInstitucion, String logoAlt, String anioeInstitucion, String titulo, String descripcion) {
        this.logoInstitucion = logoInstitucion;
        this.logoAlt = logoAlt;
        this.anioeInstitucion = anioeInstitucion;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
    
    //---------------------------------------------------------------
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogoInstitucion() {
        return logoInstitucion;
    }

    public void setLogoInstitucion(String logoInstitucion) {
        this.logoInstitucion = logoInstitucion;
    }

    public String getLogoAlt() {
        return logoAlt;
    }

    public void setLogoAlt(String logoAlt) {
        this.logoAlt = logoAlt;
    }

    public String getAnioeInstitucion() {
        return anioeInstitucion;
    }

    public void setAnioeInstitucion(String anioeInstitucion) {
        this.anioeInstitucion = anioeInstitucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
}
    
