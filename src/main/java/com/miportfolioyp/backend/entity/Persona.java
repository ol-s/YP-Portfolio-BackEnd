////////////////////////////////////hice de nuevo cos modifique todo en angular para meterlo dentro de 'persona'

package com.miportfolioyp.backend.entity;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity  //para que se cree la tabla c esos atributos @Entity,serializable no se si es de h porque tiene varias personas? lo saque
//public class Persona implements Serializable {
public class Persona {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //para autoincrementar, LUISINA PUSO   AUTO
    private int id;
       
    private String nombre;   
    private String apellido;    
    private String ocupacion;

    @Lob
    //@Column(name="xxxxxxxxxx", length=800) //lenght  ESTE FUNCIONA EN LUGAR DE LOB PARA QUE EL PHPMYADMIN TOME COMO LONGTEXT ETC!!
    //BUE, EL SOBRE MI ME TOMO CON EL LOB,,,EL LEGHT LO TOMA PARA NUM CARACTERES DEL VARCHAR
    private String sobremi;
    
    @Lob
    private String experienciasTexto;
    
    @Lob
    private String cv;
        
    private String email;

    @Lob
    private String bannerEntrada;
    @Lob
    private String bannerAvatar;
    @Lob
    private String bannerEducacion;
    @Lob
    private String bannerSalida;

    
    //para proyectos
    private String subtitulo1;    
    private String subtitulo2;

    @Lob
    private String servicios1;
    @Lob
    private String servicios2;
    
    private String salida1;
    private String salida2;

    private String copyrights;

    @Lob
    private String logoBrand;
    
    //--------------------------------------------------------

    public Persona() {
    }

    public Persona(String nombre, String apellido, String ocupacion, String sobremi, String experienciasTexto, String cv, String email, String bannerEntrada, String bannerAvatar, String bannerEducacion, String bannerSalida, String subtitulo1, String subtitulo2, String servicios1, String servicios2, String salida1, String salida2, String copyrights, String logoBrand) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.sobremi = sobremi;
        this.experienciasTexto = experienciasTexto;
        this.cv = cv;
        this.email = email;
        this.bannerEntrada = bannerEntrada;
        this.bannerAvatar = bannerAvatar;
        this.bannerEducacion = bannerEducacion;
        this.bannerSalida = bannerSalida;
        this.subtitulo1 = subtitulo1;
        this.subtitulo2 = subtitulo2;
        this.servicios1 = servicios1;
        this.servicios2 = servicios2;
        this.salida1 = salida1;
        this.salida2 = salida2;
        this.copyrights = copyrights;
        this.logoBrand = logoBrand;
    }
    
    //--------------------------------------------------------

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getSobremi() {
        return sobremi;
    }

    public void setSobremi(String sobremi) {
        this.sobremi = sobremi;
    }

    public String getExperienciasTexto() {
        return experienciasTexto;
    }

    public void setExperienciasTexto(String experienciasTexto) {
        this.experienciasTexto = experienciasTexto;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBannerEntrada() {
        return bannerEntrada;
    }

    public void setBannerEntrada(String bannerEntrada) {
        this.bannerEntrada = bannerEntrada;
    }

    public String getBannerAvatar() {
        return bannerAvatar;
    }

    public void setBannerAvatar(String bannerAvatar) {
        this.bannerAvatar = bannerAvatar;
    }

    public String getBannerEducacion() {
        return bannerEducacion;
    }

    public void setBannerEducacion(String bannerEducacion) {
        this.bannerEducacion = bannerEducacion;
    }

    public String getBannerSalida() {
        return bannerSalida;
    }

    public void setBannerSalida(String bannerSalida) {
        this.bannerSalida = bannerSalida;
    }

    public String getSubtitulo1() {
        return subtitulo1;
    }

    public void setSubtitulo1(String subtitulo1) {
        this.subtitulo1 = subtitulo1;
    }

    public String getSubtitulo2() {
        return subtitulo2;
    }

    public void setSubtitulo2(String subtitulo2) {
        this.subtitulo2 = subtitulo2;
    }

    public String getServicios1() {
        return servicios1;
    }

    public void setServicios1(String servicios1) {
        this.servicios1 = servicios1;
    }

    public String getServicios2() {
        return servicios2;
    }

    public void setServicios2(String servicios2) {
        this.servicios2 = servicios2;
    }

    public String getSalida1() {
        return salida1;
    }

    public void setSalida1(String salida1) {
        this.salida1 = salida1;
    }

    public String getSalida2() {
        return salida2;
    }

    public void setSalida2(String salida2) {
        this.salida2 = salida2;
    }

    public String getCopyrights() {
        return copyrights;
    }

    public void setCopyrights(String copyrights) {
        this.copyrights = copyrights;
    }

    public String getLogoBrand() {
        return logoBrand;
    }

    public void setLogoBrand(String logoBrand) {
        this.logoBrand = logoBrand;
    }

    
    
}
