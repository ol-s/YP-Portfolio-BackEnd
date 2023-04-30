package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.Persona;
import com.miportfolioyp.backend.service.PersonaService;
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
@RequestMapping("persona") 
@CrossOrigin("http://localhost:4200/")

public class PersonaController {
       
    @Autowired PersonaService  persoServicio;    
      
    @GetMapping("/lista")   
    @ResponseBody          
    public List<Persona> listaPersonas(){  
       return persoServicio.listaPersonas();  
    }
    
    @GetMapping("/find/{id}")     
    @ResponseBody 
    public Persona findPersona(@PathVariable int id){
        return persoServicio.findPersona(id);  
    }
        
    @PostMapping ("/new")
    @ResponseBody
    public String savePersona(@RequestBody Persona personaN){     
        persoServicio.savePersona(personaN);
        return "Usuario creado";                                                  
    }                  
    
    @PutMapping("/update/{id}")
    public String updatePersona(@PathVariable int id, @RequestBody Persona personaN){
        persoServicio.updatePersona(personaN);
        return "Usuario actualizado";      
    } 
       
    @DeleteMapping("/delete/{id}")
    public String deletePersona(@PathVariable int id){
        persoServicio.deletePersona(id);
        return "Usuario eliminado";
    }
    
        
    //Login 19-4-23------------------------------------------------
    /*del servicio autenticacion en angular 
     export class AutenticacionService {
     url = 'http://localhost:8080/persona/autenticacion/login'*/
    @PostMapping ("/autenticacion/login")
    @ResponseBody
    public Persona loginPersona(@RequestBody Persona pers) {
        return persoServicio.loginPersona(pers.getEmail(), pers.getClave());
    }
    
}
    
