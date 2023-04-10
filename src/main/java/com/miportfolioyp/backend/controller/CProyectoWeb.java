
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
@CrossOrigin("http://localhost:4200/")//(origins = "https://miportfolioyp.web.app/")
@RequestMapping("proyectoweb") 
public class CProyectoWeb {
    
  @Autowired SProyectoWeb proyWebServicio;  
    
   
    @GetMapping("/lista") 
    @ResponseBody 
    public List<ProyectoWeb> listaProyectos(){
        return proyWebServicio.listaProyectos();  
    }
    
    @GetMapping("/find/{id}")  //id es variable so va entre llaves
    @ResponseBody 
    public ProyectoWeb findProyecto(@PathVariable int id){
        return proyWebServicio.findProyecto(id);  
    }

    @PostMapping ("/new")
    @ResponseBody
    public String saveProyecto(@RequestBody ProyectoWeb proyecto){
        proyWebServicio.saveProyecto(proyecto);
        return "Proyecto creado";   
        //return ResponseEntity.ok().body(proyecto);      //???
    }
  
    @PutMapping("/update")   
    public String updateProyecto(@RequestBody ProyectoWeb proyecto){  //////////proyecto es variable, Proyecto es entidad (?) OJO
        proyWebServicio.updateProyecto(proyecto);
        return "Proyecto actualizado";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteProyecto(@PathVariable int id){
        proyWebServicio.deleteProyecto(id);
        return "Proyecto eliminado";
    }
     
    
}
