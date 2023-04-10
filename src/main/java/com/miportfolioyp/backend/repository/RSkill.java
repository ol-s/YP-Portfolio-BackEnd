
package com.miportfolioyp.backend.repository;

import com.miportfolioyp.backend.entity.Skill;
//import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RSkill extends JpaRepository<Skill, Integer>{
    //no se si long o int, lo sacamos del tipo de dato que tiene el id (expres), pero h puso long..?

    
    
    
    
    
    // desactivo DE LOS 3 porque no corre sino-------------------------------
    //intento1 DE SKILL POR RUBRO, a ver si funciona cuando corra
    //List<Skill> getSkillsBySkillRubro(Integer id);  //este creo primero, luego con el public adelante
    //public List<Skill> findBySkillRubro(Integer id);

    
    // desactivo DE LOS 3 porque no corre sino-------------------------------
    //intento 2 DE SKILL POR RUBRO, no, termina creando en service un 'unsupported, no se lo que estoy haciendo tbh
    //public List<Skill> findBySkillRubro();
    
}
