
package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.Educacion;
import com.miportfolioyp.backend.service.SEducacion;
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
@CrossOrigin("http://localhost:4200/") 
@RequestMapping("educacion") //localhost:8080/educacion
public class CEducacion {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SEducacion eduServicio;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<Educacion> listaEstudios(){
        return eduServicio.listaEstudios();  
    }
    
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Educacion findEstudio(@PathVariable int id){
        return eduServicio.findEducacion(id);  
    }
    
    @PostMapping ("/new")
    @ResponseBody
    public String saveEducacion(@RequestBody Educacion estudio){
        eduServicio.saveEducacion(estudio);
        return "Estudio creado";          
    }
    
    @PutMapping("/update/{id}") 
    public String updateEstudio(@PathVariable int id, @RequestBody Educacion estudio){
        eduServicio.updateEducacion(estudio);
        return "Estudio actualizado";   
    }
          
    @DeleteMapping("/delete/{id}")
    public String deleteEstudio(@PathVariable int id){
        eduServicio.deleteEducacion(id);
        return "Estudio eliminado";
    }       
}
