/////////////////////////////////////////si no uso este para experiencia usar para sobre mi -- id+descripcion
///////////////////////////////////////////////////////////////////////////////////////////////////////////
package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.Experiencia;
import com.miportfolioyp.backend.service.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200/")   //(origins = "https://mipotfolioyp.web.app/") ("*")
@RequestMapping("experiencia") //localhost:8080/experiencia
public class CExperiencia {

    @Autowired  SExperiencia experienciaServicio;
 
    @GetMapping("/lista")
    @ResponseBody 
    public List<Experiencia>  listaExp(){
        return experienciaServicio.listaExp();  
    }

    @GetMapping("/find/{id}")   ///////////////////////////ojo con las barras
    @ResponseBody 
    public Experiencia findExperiencia(@PathVariable int id){
        //si retorna vacío no pasa nada
        return experienciaServicio.findExperiencia(id);  
    }

    @PostMapping ("/new")
    @ResponseBody
    public String saveExperiencia(@RequestBody Experiencia textoExp){
        experienciaServicio.saveExperiencia(textoExp);
        return "Experiencia creada";  ///saco los return
//        //return ResponseEntity.ok().body(pers);
    }
    
    //para editar 
    //@PutMapping ("update/{id}") //con id pongo /numero id, editar id abajo en los campos, y crea otra experiencia etc, conotro id ma (:  
    @PutMapping("/update")   
    public String updateExperiencia(@RequestBody Experiencia textoExp){
        experienciaServicio.updateExperiencia(textoExp);
        return "Experiencia actualizada"; 
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteExperiencia(@PathVariable int id){
        experienciaServicio.deleteExperiencia(id);
        return "Experiencia eliminada"; 
    }
    
    
    //----------------------------------------------------------sin el return seria    
//    @PostMapping("/create")
//    public void create(@RequestBody Experiencia textoExp) {
//        experienciaServicio.saveExperiencia(textoExp);   ////////////////////////viene del servicio, que tenga el mismo nombre
//    }
//    
//    @PutMapping("/update")
//    public void update(@RequestBody Experiencia textoExp) {
//        experienciaServicio.updateExperiencia(textoExp);
//    }
//    
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable ("id") int id){
//        experienciaServicio.deleteExperiencia(id);
//    }
    
}

    
    