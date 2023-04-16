
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

// k , ojo login y post, todos los servicios actually, sssssss
@RestController
@CrossOrigin("http://localhost:4200/")//(origins = "https://miportfolioyp.web.app/")
@RequestMapping("proyecto") //////ahora, esto es una sola pagina, a donde llevaria el barra/something??
public class CProyecto {
    
    //cableado a servicios Proyecto
    @Autowired SProyecto proyectoServicio;
    
    @GetMapping("/lista")  //ojo aca con la barra antes o despues, va antes siempre no?
    @ResponseBody 
    public List<Proyecto> listaProyectos(){
        return proyectoServicio.listaProyectos();  
    }
    
    //h------------ 
//    @GetMapping ("/lista")
//    public ResponseEntity<List<Proyecto>> listaProyectos(){
//        List<Proyecto> list = proyectoServicio.list();
//        return new ResponseEntity(list, HttpStatus.OK);
//    }
    
    
    
    
    @GetMapping("/find/{id}")  //id es variable so va entre llaves
    @ResponseBody 
    public Proyecto findProyecto(@PathVariable int id){
        return proyectoServicio.findProyecto(id);  
    }
    //h----------no se, tiene by find persona id
    
    
    
    
    //@RequestBody es para recibir un proyecto nuevo, viene del json
    @PostMapping ("/new")
    @ResponseBody
    public String saveProyecto(@RequestBody Proyecto proyecto){
        proyectoServicio.saveProyecto(proyecto);
        return "Proyecto creado";   
        //return ResponseEntity.ok().body(proyecto);      //???
    }
  
    /*@PutMapping("/update")   
    public String updateProyecto(@RequestBody Proyecto proyecto){  //////////proyecto es variable, Proyecto es entidad (?) OJO
        proyectoServicio.updateProyecto(proyecto);
        return "Proyecto actualizado";
        //return new ResponseEntity(HttpStatus.OK);
    }*/
    @PutMapping("/update/{id}")   
    public String updateProyecto(@PathVariable int id, @RequestBody Proyecto proyecto){ 
        proyectoServicio.updateProyecto(proyecto);
        return "Proyecto actualizado";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteProyecto(@PathVariable int id){
        proyectoServicio.deleteProyecto(id);
        return "Proyecto eliminado";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    
    //h----------sin el return---------
//    @PostMapping("/create")
//    public void create(@RequestBody Proyecto proyecto) {
//        proyectoServicio.saveProyecto(proyecto);  ////////////////////////viene del servicio, que tenga el mismo nombre
//    }
//        
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable ("id") int id){
//        proyectoServicio.deleteProyecto(id);
//    }
//    
//    @PutMapping("/update")
//    public void edit(@RequestBody Proyecto proyecto) {
//        proyectoServicio.updateProyecto(proyecto);
//    }
    
    
}
