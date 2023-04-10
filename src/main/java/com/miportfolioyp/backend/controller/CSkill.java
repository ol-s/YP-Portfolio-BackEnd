
package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.Skill;
import com.miportfolioyp.backend.service.SSkill;
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
//@CrossOrigin(origins = "http://localhost:4200") //cruza con angular
//@CrossOrigin(origins = "https://miportfolioyp.web.app/")
@CrossOrigin("http://localhost:4200/")
@RequestMapping("skill") //localhost:8080/skill
public class CSkill {
    
    //controlador conectado al servicio, servicio al repository y repository a la bd   
    @Autowired SSkill skillServicio;
    
    
 
    @GetMapping("/lista")
    @ResponseBody 
    public List<Skill> listaSkills(){
        return skillServicio.listaSkills();  
    }
   
    
    //para ver skills 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Skill findSkill(@PathVariable int id){
        //si retorna vacío no pasa nada
        return skillServicio.findSkill(id);  
    }
    
    //@RequestBody es para recibir una habilidad nueva. Viene en un JSON
    @PostMapping ("/new")
    @ResponseBody
    public String saveSkill(@RequestBody Skill habil){
        skillServicio.saveSkill(habil);
        return "Skill creada";
        //return ResponseEntity.ok().body(habil);
    
    }
    
    //para editar
    @PutMapping("/update")   
    public String updateSkill(@RequestBody Skill habil){
        skillServicio.updateSkill(habil);
        return "Skill actualizada";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteSkill(@PathVariable int id){
        skillServicio.deleteSkill(id);
        return "Skill borrada";
        //return new ResponseEntity(HttpStatus.OK);
        
        //ESTOS RETURNS H NO LOS PUSO, VERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
    }
    
    
    
    
    
    
    
    
    
    
    
// desactivo DE LOS 3 porque no corre sino-------------------------------
//    @GetMapping("/find/skillrubro/{id}/skill")
//    public List<Skill> getSkillsBySkillrubro(@PathVariable int id){
//        return skillServicio.getSkillsBySkillrubro(id);
//    }
    
    
    // desactivo DE LOS 3 porque no corre sino-------------------------------
    //intento 2 DE SKILL POR RUBRO
//    public List<Skill> findBySkillRubro(){
//        return skillServicio.getSkillsBySkillrubro();
//    }
    
}