package com.miportfolioyp.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Red {
    
    //-----------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    //@NotNull
    @Column(name="red", length=100)
    private String nombre;
    
    //@NotNull
    //@Column(name="url")
    private String url;
    
    //@NotNull
    //@Column(name="icon")
    @Column(length=100)
    private String iconred;  
    
    //-----------------------------------------------------------------
    public Red() {
    }

    public Red(int id, String nombre, String url, String iconred) {
        //this.id = id;
        this.nombre = nombre;
        this.url = url;
        this.iconred = iconred;
    }
    //----------------------------------------------------------------- 

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIconred() {
        return iconred;
    }

    public void setIconred(String iconred) {
        this.iconred = iconred;
    }
      
    
}
