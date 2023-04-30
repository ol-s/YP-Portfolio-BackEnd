package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.SkillArq;
import com.miportfolioyp.backend.service.SSkillArq;
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
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("skillarq") //localhost:8080/skillarq
public class CSkillArq {

    @Autowired SSkillArq saServ;
       
    @GetMapping("/lista")
    @ResponseBody 
    public List<SkillArq> listaSkillsA(){
        return saServ.listaSkillsA();  
    }
   
    @GetMapping("/find/{id}")
    @ResponseBody 
    public SkillArq findSkillA(@PathVariable int id){
        return saServ.findSkillA(id);  
    }
    
    @PostMapping ("/new")
    @ResponseBody
    public String saveSkillA(@RequestBody SkillArq habil){
        saServ.saveSkillA(habil);
        return "Skill creada";  
    }

    @PutMapping("/update/{id}") 
    public String updateSkillA(@PathVariable int id, @RequestBody SkillArq habil){  //NOMBRE QUE LLEVO A ANGULAR!                                                          
        saServ.updateSkillA(habil);  //NOMBRE DEL METODO EN SKILL-ARQ-SERVICIO, no me toma el id aca
        return "Skill actualizada"; //MENSAJE EN POSTMAN
    }
      
    @DeleteMapping("/delete/{id}")
    public String deleteSkillA(@PathVariable int id){
        saServ.deleteSkillA(id);
        return "Skill borrada";
    }   
    
}