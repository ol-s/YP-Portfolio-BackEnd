
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
//
//@RestController
//@CrossOrigin("*")   //(origins = "https://miportfolioyp.web.app/")
//@RequestMapping("educacion") 
//public class CEducacion {
//    
//    @Autowired  SEducacion educServicio;
//    
//    @GetMapping("/lista") 
//    @ResponseBody 
//    public List<Educacion> listaEstudios(){
//        return educServicio.listaEstudios();  
//    }
//
//    @GetMapping("/find/{id}")
//    @ResponseBody 
//    public Educacion findEducacion(@PathVariable int id){
//        return educServicio.findEducacion(id);  
//    }
//    
////    //@RequestBody es para recibir data del json, nuevo estudio
////    @PostMapping("/new")
////    @ResponseBody
////    public String saveEducacion(@RequestBody Educacion estudio){
////        educServicio.saveEducacion(estudio);
////        return "Estudio creado";
////        //return ResponseEntity.ok().body(estudio);
////    }
//    
//    @PostMapping ("/new")
//    @ResponseBody
//    public String save(@RequestBody Educacion est){
//        educServicio.saveEducacion(est);
//        return "Educacion creada";
//            //return ResponseEntity.ok().body(redes);
//    
//    }
//    
//    
//    
//    
//    
//    
//    
//    
//    
//       
//    @PutMapping("/update/{id}")   
//    public String updateEducacion(@RequestBody Educacion estudio){
//        educServicio.updateEducacion(estudio);
//        return "Estudio actualizado";
//        //return new ResponseEntity(HttpStatus.OK);
//    }
//    
//    @DeleteMapping("/delete/{id}")
//    public String deleteEducacion(@PathVariable int id){
//        educServicio.deleteEducacion(id);
//        return "Estudio eliminado";
//        //return new ResponseEntity(HttpStatus.OK);
//    }
//    
//    
//    
//    //------------------sin return
//    
//    //@RequestBody es para recibir data del json, nuevo estudio
////    @PostMapping("/create")
////    //@ResponseBody
////    public void create(@RequestBody Educacion estudio){
////        educServicio.saveEducacion(estudio);
////    }
////    
////    @PutMapping("/update")
////    public void update(@RequestBody Educacion estudio){
////        educServicio.updateEducacion(estudio);
////    }
////    
////    @DeleteMapping("/delete/{id}")
////    public void delete(@PathVariable ("id") int id){
////        educServicio.deleteEducacion(id);
////    }
//    
//    
//}



@RestController
@CrossOrigin("http://localhost:4200/")  //CORREGIR LAS RUTAS EN TODOS, SACAR EL (*)  SINO NO CARGA EN EL FRONT!!! CONECTADO, EDITADO EL FRONT DESDE PHPMYADMIN 5/4/23
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
          
    @PutMapping("/update") 
    public String updateEstudio(@RequestBody Educacion estudio){
        eduServicio.updateEducacion(estudio);
        return "Estudio actualizado";   
    }
      
    @DeleteMapping("/delete/{id}")
    public String deleteEstudio(@PathVariable int id){
        eduServicio.deleteEducacion(id);
        return "Estudio eliminado";
    }    
    
}
