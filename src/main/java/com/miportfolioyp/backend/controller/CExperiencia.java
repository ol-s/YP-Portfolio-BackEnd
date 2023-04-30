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
@CrossOrigin("http://localhost:4200/") 
@RequestMapping("experiencia") //localhost:8080/experiencia
public class CExperiencia {

    @Autowired  SExperiencia experienciaServicio;
 
    @GetMapping("/lista")
    @ResponseBody 
    public List<Experiencia>  listaExp(){
        return experienciaServicio.listaExp();  
    }

    @GetMapping("/find/{id}") 
    @ResponseBody 
    public Experiencia findExperiencia(@PathVariable int id){
        return experienciaServicio.findExperiencia(id);  
    }

    @PostMapping ("/new")
    @ResponseBody
    public String saveExperiencia(@RequestBody Experiencia textoExp){
        experienciaServicio.saveExperiencia(textoExp);
        return "Experiencia creada"; 
    }
    
    @PutMapping ("update/{id}")  
    public String updateExperiencia(@PathVariable int id, @RequestBody Experiencia textoExp){
        experienciaServicio.updateExperiencia(textoExp);
        return "Experiencia actualizada"; 
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteExperiencia(@PathVariable int id){
        experienciaServicio.deleteExperiencia(id);
        return "Experiencia eliminada"; 
    }
   
    
}

    
    