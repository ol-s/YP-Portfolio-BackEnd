package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.Proyecto;
import com.miportfolioyp.backend.service.SProyecto;
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
@RequestMapping("proyecto")
public class CProyecto {
    
    @Autowired SProyecto proyectoServicio;
    
    @GetMapping("/lista") 
    @ResponseBody 
    public List<Proyecto> listaProyectos(){
        return proyectoServicio.listaProyectos();  
    }
       
    @GetMapping("/find/{id}") 
    @ResponseBody 
    public Proyecto findProyecto(@PathVariable int id){
        return proyectoServicio.findProyecto(id);  
    } 
    
    //@RequestBody para recibir un proyecto nuevo, viene del json
    @PostMapping ("/new")
    @ResponseBody
    public String saveProyecto(@RequestBody Proyecto proyecto){
        proyectoServicio.saveProyecto(proyecto);
        return "Proyecto creado";       
    }
  
    @PutMapping("/update/{id}")   
    public String updateProyecto(@PathVariable int id, @RequestBody Proyecto proyecto){ 
        proyectoServicio.updateProyecto(proyecto);
        return "Proyecto actualizado";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteProyecto(@PathVariable int id){
        proyectoServicio.deleteProyecto(id);
        return "Proyecto eliminado";
    }         
}
