
package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.SkillWeb;
import com.miportfolioyp.backend.service.SSkillWeb;
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
@RequestMapping("skillweb") //localhost:8080/skillweb
public class CSkillWeb {
    
    @Autowired SSkillWeb swServ;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<SkillWeb> listaSkillsW(){
        return swServ.listaSkillsW();  
    }
   
    @GetMapping("/find/{id}")
    @ResponseBody 
    public SkillWeb findSkillW(@PathVariable int id){
        return swServ.findSkillW(id);  
    }
    
    @PostMapping ("/new")
    @ResponseBody
    public String saveSkillW(@RequestBody SkillWeb habil){
        swServ.saveSkillW(habil);
        return "Skill creada";  
    }
  
    @PutMapping("/update/{id}") 
    public String updateSkillW(@PathVariable int id, @RequestBody SkillWeb habil){                                                    
        swServ.updateSkillW(habil);  
        return "Skill actualizada";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteSkillW(@PathVariable int id){
        swServ.deleteSkillW(id);
        return "Skill borrada";
    }    
    
}
