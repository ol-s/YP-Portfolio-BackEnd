package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.ProyectoWeb;
import com.miportfolioyp.backend.service.SProyectoWeb;
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
@RequestMapping("proyectoweb") 
public class CProyectoWeb {
    
  @Autowired SProyectoWeb proyWebServicio;  
     
    @GetMapping("/lista") 
    @ResponseBody 
    public List<ProyectoWeb> listaProyectosW(){
        return proyWebServicio.listaProyectos();  
    }
    
    @GetMapping("/find/{id}")
    @ResponseBody 
    public ProyectoWeb findProyectoW(@PathVariable int id){
        return proyWebServicio.findProyecto(id);  
    }

    @PostMapping ("/new")
    @ResponseBody
    public String saveProyectoW(@RequestBody ProyectoWeb proyecto){
        proyWebServicio.saveProyecto(proyecto);
        return "Proyecto creado";   
    }
  
    @PutMapping("/update/{id}")   
    public String updateProyectoW(@PathVariable int id, @RequestBody ProyectoWeb proyecto){  
        proyWebServicio.updateProyecto(proyecto);
        return "Proyecto actualizado";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteProyectoW(@PathVariable int id){
        proyWebServicio.deleteProyecto(id);
        return "Proyecto eliminado";
    }
        
}
