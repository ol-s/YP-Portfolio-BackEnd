package com.miportfolioyp.backend.service;

import com.miportfolioyp.backend.entity.Skill;
import com.miportfolioyp.backend.repository.RSkill;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional //para persistencia en la base de datos
public class SSkill {

    //resumen, lo que sea que escriba aca abajo ya no corre y da  ''Consider defining a bean of type in your configuration''
    //y prendo solo el  @Autowired  public RSkill skillRepo; y ya no corre, definir bean etc
    //me faltaba esto en el repository, aaaaaaaa  JpaRepository<Skill, Integer>, listooooo
    
    
    //cableado a skill repository
    //controlador conectado al servicio, servicio al repository y repository a la bd   
    @Autowired RSkill skillRepo;

//    public List<Skill> list() {  //h, list es variable, es lo mismo que abajo no?, si dejo esta cambiar en el controller y viceversa
//        return skillRepo.findAll();
//    }

    //K
    public List<Skill> listaSkills() {
        return skillRepo.findAll();
    }
        

    //ahi no me dio mas error el orElse, pff
    public Skill findSkill(Integer id) {
        return skillRepo.findById(id).orElse(null);
    }
    
    //crear o guardar nueva?
    public void saveSkill(Skill habilidad) {
        skillRepo.save(habilidad);
    }
    //esta es modificar red tho, saveSkill es create?
    public void updateSkill(Skill habilidad) {
        skillRepo.save(habilidad);
    }

    public void deleteSkill(Integer id) {
        skillRepo.deleteById(id);
    }
    
    //VER COMO INCLUIR POR RUBROS, O SI SOLO TCANDO EN EL DROPDOWNEN HTML YA SELECCIONA, NO CREO,
    //y es solo para agregar porque despues hay boton unico para editar y eliminar cada skill
//     public void saveSkillByRubro(Skill habilidad) {
//        skillRepo.save(habilidad);
//    }

    
    
    
    
    
    
//h-tiene lista personas creo
//    public List<Skill> findBySkillRubro(Integer id) {
//        return skillRepo.findBySkillRubro(int id);
//    } 
    
     
     
     
    
    // desactivo DE LOS 3 porque no corre sino-------------------------------
    //ESTE CORRIAAAAA  pero agregando en R o S pedia agregar aca, y aca viene con unsoportedoperationetc, todo asi
    //, no se como ponerlas por rubro tbh, ----estaba de mas el interget abajo parece, asi corre, no si si andara tho, ya no corrio
//    public List<Skill> getSkillsBySkillRubro(Integer id){
//        return skillRepo.findBySkillRubro(id);
//    }
     
     // desactivo DE LOS 3 porque no corre sino-------------------------------
//        public List<Skill> getSkillsBySkillRubro(){
//        return skillRepo.findBySkillRubro();
//    }
    
    
     
     
     
     
     
     
     
     
    
   
    //hay que incluirla en el repository, pero pide crearlo aca,y aca lo creaasi unsopportedoperation etc
//    public List<Skill> getSkillsBySkillrubro(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    
    //buo, dio error en elcontroller, y lo mando aca con int no interger
//    public List<Skill> getSkillsBySkillrubro(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

//    public List<Skill> getSkillsBySkillrubro(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    
}
