///////////////////////////////////////este probs no use, ponerlo como parrafo en persona, o solo descripcion aca
//////////////////////////////////////lo dejo escrito pero no genero la tabla en phmyadmin
//////////////////////////////////////o lo dejo solo con id y descripcion?  K tiene asi separado elsobremi

/////////////////////////////////////////si no uso este para experiencia usar para sobre mi -- id+descripcion
///////////////////////////////////////////////////////////////////////////////////////////////////////////


package com.miportfolioyp.backend.entity;

import java.util.Date;
import javax.persistence.Column;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //para autoincrementar, LUISINA PUSO   AUTO, h dijo que autoincrementaba en cualquier numero,tipo 1,2,51...                     
    private int id;
    
    @Column(length=100)
    private String rubro;
    
    @Lob
    private String logoLugar;
    
    @Column(length=100)
    private String lugar;
    
    @Column(length=100)
    private String puesto;
    
    @Lob
    //@Column(name="descripcion", length=800)
    private String descripcion;
    
    private Date fechaInicio;
    private Date fechaFin;       //lo dejoasi por ahora, me da error en 'date' creo que hay que importar algo
    //private boolean esTrabajoActual;
    
    
       
    //----------------------------------------------------------------
    public Experiencia() {
    }

    

    public Experiencia(String rubro, String logoLugar, String lugar, String puesto, String descripcion, Date fechaInicio, Date fechaFin, boolean esTrabajoActual) {
        this.rubro = rubro;
        this.logoLugar = logoLugar;
        this.lugar = lugar;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        //this.esTrabajoActual = esTrabajoActual;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

//    public boolean isEsTrabajoActual() {
//        return esTrabajoActual;
//    }
//
//    public void setEsTrabajoActual(boolean esTrabajoActual) {
//        this.esTrabajoActual = esTrabajoActual;
//    }
    
    
 
    
    
}
