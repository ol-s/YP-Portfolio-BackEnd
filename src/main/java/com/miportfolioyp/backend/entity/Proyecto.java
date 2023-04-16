package com.miportfolioyp.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Proyecto {

    //puse todo igual en json, mysql y aca, no se si es asi eh
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //para autoincrementar, LUISINA PUSO   AUTO
    private int id;
    
    @Column(length=100)
    private String rubro;
    
    @Lob
    //@Column(name="imgPageProyecto")
    private String imgPageProyecto;
    
    @Column(length=50)
    //@Column(name="imgPageAlt")
    private String imgPageAlt;
    
    @Lob
    //@Column(name="hrefTargetBlank")
    private String hrefTargetBlank;
    
//    @Column(name="")  //no se si voy a usar esto, en angular no lo meti en el html, si en el json 
//    private String targetBlackAlt;
    
    @Lob
   // @Column(name="hrefRepo")
    private String hrefRepo;
    
    @Lob
    //@Column(name="hrefLive")
    private String hrefLive;
    
    @Column(length=100)
   // @Column(name="tituloProyecto")
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
//        this.targetBlackAlt = targetBlackAlt;
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

//    public String getTargetBlackAlt() {
//        return targetBlackAlt;
//    }
//
//    public void setTargetBlackAlt(String targetBlackAlt) {
//        this.targetBlackAlt = targetBlackAlt;
//    }

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
