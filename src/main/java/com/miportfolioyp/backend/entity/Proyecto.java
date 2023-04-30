package com.miportfolioyp.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int id;
    
    @Column(length=100)
    private String rubro;
    
    @Lob
    private String imgPageProyecto;
    
    @Column(length=50)
    private String imgPageAlt;
    
    @Lob
    private String hrefTargetBlank;
    
    @Lob
    private String hrefRepo;
    
    @Lob
    private String hrefLive;
    
    @Column(length=100)
    private String tituloProyecto;
    
    //@Lob
    @Column(length=900)
    private String descripcion;

    //----------------------------------------------------------------------
    
    public Proyecto() {
    }

    public Proyecto(int id, String rubro, String imgPageProyecto, String imgPageAlt, String hrefTargetBlank, String targetBlackAlt, String hrefRepo, String hrefLive, String tituloProyecto, String descripcion) {
      
        this.rubro = rubro;
        this.imgPageProyecto = imgPageProyecto;
        this.imgPageAlt = imgPageAlt;
        this.hrefTargetBlank = hrefTargetBlank;
        this.hrefRepo = hrefRepo;
        this.hrefLive = hrefLive;
        this.tituloProyecto = tituloProyecto;
        this.descripcion = descripcion;
    }
    
    //----------------------------------------------------------------------

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

    public String getImgPageProyecto() {
        return imgPageProyecto;
    }

    public void setImgPageProyecto(String imgPageProyecto) {
        this.imgPageProyecto = imgPageProyecto;
    }

    public String getImgPageAlt() {
        return imgPageAlt;
    }

    public void setImgPageAlt(String imgPageAlt) {
        this.imgPageAlt = imgPageAlt;
    }

    public String getHrefTargetBlank() {
        return hrefTargetBlank;
    }

    public void setHrefTargetBlank(String hrefTargetBlank) {
        this.hrefTargetBlank = hrefTargetBlank;
    }

    public String getHrefRepo() {
        return hrefRepo;
    }

    public void setHrefRepo(String hrefRepo) {
        this.hrefRepo = hrefRepo;
    }

    public String getHrefLive() {
        return hrefLive;
    }

    public void setHrefLive(String hrefLive) {
        this.hrefLive = hrefLive;
    }

    public String getTituloProyecto() {
        return tituloProyecto;
    }

    public void setTituloProyecto(String tituloProyecto) {
        this.tituloProyecto = tituloProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

}
