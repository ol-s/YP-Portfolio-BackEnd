package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.Red;
import com.miportfolioyp.backend.service.SRed;
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
@CrossOrigin("http://localhost:4200/")  //para cruzar con angular
@RequestMapping("red") //localhost:8080/red
public class CRed {
    
    @Autowired
    SRed redServicio;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<Red> listaRedes(){
        return redServicio.listaRedes();  
    }
    
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Red findRed(@PathVariable int id){
        return redServicio.findRed(id);  
    }
    
    @PostMapping ("/new")
    @ResponseBody
    public String saveRed(@RequestBody Red redes){
        redServicio.saveRed(redes);
        return "Red creada";
    }
       
    @PutMapping("/update/{id}") 
    public String updateRed(@PathVariable int id, @RequestBody Red redes){
        redServicio.updateRed(redes);
        return "Red actualizada";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteRed(@PathVariable int id){  
        redServicio.deleteRed(id);
        return "Red eliminada";
    }
       
}

