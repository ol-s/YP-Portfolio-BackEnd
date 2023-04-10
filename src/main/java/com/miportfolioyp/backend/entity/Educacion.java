package com.miportfolioyp.backend.entity;

//import java.io.Serializable;
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
    //@Column(name="logoAlt")
    private String logoAlt;
    
    //@Column(name="anioeInstitucion")
    private String anioeInstitucion;
    
    //@Column(name="titulo")
    private String titulo;    
    
    //apago porque eljson de angular no tiene esto,desp veo como pongo el banner de seccion:/
    //@Column(name="descripcion")  //NO ME CARGA EN POSTMAN APAGANDO, NO SE SI ES ESO, Y EN PHPMYADMIN NO ME ELIMINA LAS COLUMNAS APAGANDO, SO
    private String descripcion;
    
    
    //dejo banner aca o los pongo todo en persona, cosa de editar todos ahi y listo? NO LO PONGO AHORA, PARA SIMPLIFICAR EN POSTMAN
//    @Column(name="bannerEducacion")
//    private String bannerEducacion;
    
    
    
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
    
//////////////////////////////////////////////////////
    ///////BORRE LA TABLA EN PHPMYADM(DROP TABLE) , CREE DE NUEVO (JUST RUN ACA DE NUEVO) Y ANDUVO POSTMAN, borrar lo de abajo    
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
//PRUEBA PARA VER SI ANDABA PONEINDO LOS ATIBUTOS DE RED,,,,BORRE LA TABLA EN PHPMYADM(DROP TABLE) , CREE DE NUEVO (JUST RUN ACA DE NUEVO) Y ANDUVO POSTMAN    
//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private int id;
//    
//    //@NotNull
//    @Column(name="red")
//    private String nombre;
//    
//    //@NotNull
//    @Column(name="url")
//    private String url;
//    
//    //@NotNull
//    @Column(name="icon")
//    private String iconred;  
//    
//   
////------------------------------------------------------------- 
//
//    public Educacion() {
//    }
//
//    public Educacion(String nombre, String url, String iconred) {
//        this.nombre = nombre;
//        this.url = url;
//        this.iconred = iconred;
//    }
////-------------------------------------------------------------
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getIconred() {
//        return iconred;
//    }
//
//    public void setIconred(String iconred) {
//        this.iconred = iconred;
//    }





    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) 
//    private int id;
//    
//    @Column(name="logoInstitucion")
//    private String logoInstitucion;
//    
//    @Column(name="logoAlt")
//    private String logoAlt;
//    
//    @Column(name="anioeInstitucion")
//    private String anioeInstitucion;
//    
//    @Column(name="titulo")
//    private String titulo;
//    
//    
//    //apago porque eljson de angular no tiene esto,desp veo como pongo el banner de seccion:/
//    @Column(name="descripcion")  //NO ME CARGA EN POSTMAN APAGANDO, NO SE SI ES ESO, Y EN PHPMYADMIN NO ME ELIMINA LAS COLUMNAS APAGANDO, SO
//    private String descripcion;
//    
//    @Column(name="bannerEducacion")
//    private String bannerEducacion;
//
//    //----------------------------------------------------------------
//    public Educacion() {
//    }
//
//    public Educacion(int id, String logoInstitucion, String logoAlt, String anioeInstitucion, String titulo, String descripcion, String bannerEducacion) {
//        //this.id = id;
//        this.logoInstitucion = logoInstitucion;
//        this.logoAlt = logoAlt;
//        this.anioeInstitucion = anioeInstitucion;
//        this.titulo = titulo;
//        this.descripcion = descripcion;
//        this.bannerEducacion = bannerEducacion;
//    }
//    
//    
//    
//    //----------------------------------------------------------------
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getLogoInstitucion() {
//        return logoInstitucion;
//    }
//
//    public void setLogoInstitucion(String logoInstitucion) {
//        this.logoInstitucion = logoInstitucion;
//    }
//
//    public String getLogoAlt() {
//        return logoAlt;
//    }
//
//    public void setLogoAlt(String logoAlt) {
//        this.logoAlt = logoAlt;
//    }
//
//    public String getAnioeInstitucion() {
//        return anioeInstitucion;
//    }
//
//    public void setAnioeInstitucion(String anioeInstitucion) {
//        this.anioeInstitucion = anioeInstitucion;
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public String getDescripcion() {
//        return descripcion;
//    }
//
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }
//
//    public String getBannerEducacion() {
//        return bannerEducacion;
//    }
//
//    public void setBannerEducacion(String bannerEducacion) {
//        this.bannerEducacion = bannerEducacion;
//    }
//
//  
