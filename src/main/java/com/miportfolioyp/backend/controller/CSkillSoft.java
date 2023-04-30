
package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.SkillSoft;
import com.miportfolioyp.backend.service.SSkillSoft;
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
@RequestMapping("skillsoft") //localhost:8080/skillsoft
public class CSkillSoft {

    @Autowired SSkillSoft ssServ;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<SkillSoft> listaSkillsS(){
        return ssServ.listaSkillsS();  
    }
   
    @GetMapping("/find/{id}")
    @ResponseBody 
    public SkillSoft findSkillS(@PathVariable int id){
        return ssServ.findSkillS(id);  
    }
    
    @PostMapping ("/new")
    @ResponseBody
    public String saveSkillS(@RequestBody SkillSoft habil){
        ssServ.saveSkillS(habil);
        return "Skill creada";  
    }
      
    @PutMapping("/update/{id}") 
    public String updateSkillS(@PathVariable int id, @RequestBody SkillSoft habil){  //NOMBRE QUE LLEVO A ANGULAR!                                                          
        ssServ.updateSkillS(habil);  //NOMBRE DEL METODO EN SKILL-SOFT-SERVICIO
        return "Skill actualizada"; //MENSAJE EN POSTMAN
    }
   
    
    @DeleteMapping("/delete/{id}")
    public String deleteSkillS(@PathVariable int id){
        ssServ.deleteSkillS(id);
        return "Skill borrada";
    }    
    
}
