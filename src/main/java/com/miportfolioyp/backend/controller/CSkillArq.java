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
import org.springframework.web.bind.annotation.RequestParam;
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
      
    //pongo by id en el controller porque puse by id en angular,k, sino crea una skill nueva el lugar de editar
    //no se si no va como el find y el delete aca  (@PathVariable int id), asi como esta crea nueva en lugar de editar
    //@PutMapping("/update/") //no camia nada en postman, si queres editar tenes que poner el id en el json 
    /*
    @PutMapping("/update/{id}") 
    public String updateSkillA(@RequestBody SkillArq habil){  //NOMBRE QUE LLEVO A ANGULAR!                                                          
        saServ.updateSkillA(habil);  //NOMBRE DEL METODO EN SKILL-ARQ-SERVICIO
        return "Skill actualizada"; //MENSAJE EN POSTMAN
    }
    */
    
    
    /*  //da error el segundo id
    @PutMapping("/update/{id}")   
    public String updateSkillA(@PathVariable int id){  //NOMBRE QUE LLEVO A ANGULAR!                                                          
        saServ.updateSkillA(id);  //NOMBRE DEL METODO EN SKILL-ARQ-SERVICIO
        return "Skill actualizada"; //MENSAJE EN POSTMAN
    }*/
    
    
    
    
    @DeleteMapping("/delete/{id}")
    public String deleteSkillA(@PathVariable int id){
        saServ.deleteSkillA(id);
        return "Skill borrada";
    }  
    




/*
//de ap, pero da todo error    
@PutMapping ("/update/{id}")
public SkillArq updateSkillA (
@PathVariable int id,
@RequestParam ("nombre") String nuevoNombre,
@RequestParam ("porcentaje") String nuevoPorcentaje, {

SkillArq ska = RSkillArq.findSkillA(id); //no se si va personacontroller o cual aca, da errores o importar/crear clase/metodo en otro lado

ska.setNombre(nuevoNombre) ;
ska.setPorcentaje(nuevoPorcentaje);

CSkillArq.save(ska);

return SkillArq.ok(ska);
    
*/   
    
    
    
    
  //pfffffffffffff, tambien me crea uno nuevo en postman sin poner el id en el cuerpo del json//arreglado con los inputs correctos
    @PutMapping("/update/{id}") 
    public String updateSkillA(@PathVariable int id, @RequestBody SkillArq habil){  //NOMBRE QUE LLEVO A ANGULAR!                                                          
        saServ.updateSkillA(habil);  //NOMBRE DEL METODO EN SKILL-ARQ-SERVICIO, no me toma el id aca
        return "Skill actualizada"; //MENSAJE EN POSTMAN
    }
    
}