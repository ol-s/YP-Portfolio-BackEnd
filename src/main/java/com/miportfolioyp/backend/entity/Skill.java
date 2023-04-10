package com.miportfolioyp.backend.entity;

//import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.lang.NonNull;


//import javax.validation.constraints.Max; // no me los toma y se queda imortando horas pero no carga nada  ''searching'' 
//import javax.validation.constraints.Min;



//---------------------------------------------------------------
@Entity
public class Skill{   //serializable no lo tiene h pero a mi me da foco rojo si no incluyo, y el warning en entidad no se va desde 31-3-23

    @Id //id tmb seria notnull no?
    //@NotNull  //puse yo
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull //por ahora no me pone not null en phpmyadmin, NULL NULLEABLEE ME PONE (:
    @Column(name="rubro", length=100)
    private String rubro;

    @NonNull  //CAMBIE MANUALMENTE EN PHMYADMIN  NOTNULL, NO HACE NADA ACA THO, volvi a poner como estaba cos me abrio con error pink
    @Column(name="nombre", length=150)
    private String nombre;
    
    @NonNull   //notnull tenia yo, es lo mismo?
//    @Min(0)  @Max(100)  //no me los toma y se queda imortando horas pero no carga nada  ''searching'' 
    @Column(name="porcentaje")
    private int porcentaje;

    
    
    //-------------------------------------------------------------
    public Skill() {
    }

    public Skill(int id, String rubro, String nombre, int porcentaje) {
        this.id = id;
        this.rubro = rubro;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        //H   this.persona = persona;
    }

    //-------------------------------------------------------------
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
