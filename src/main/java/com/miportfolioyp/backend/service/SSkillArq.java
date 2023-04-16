
package com.miportfolioyp.backend.service;

import com.miportfolioyp.backend.entity.SkillArq;
import com.miportfolioyp.backend.repository.RSkillArq;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional //para persistencia en la base de datos
public class SSkillArq {
  
 @Autowired RSkillArq saRepo;   
   

  public List<SkillArq> listaSkillsA() {
        return saRepo.findAll();
    }

    public SkillArq findSkillA(Integer id) {
        return saRepo.findById(id).orElse(null);
    }

    public void saveSkillA(SkillArq habilidad) {
        saRepo.save(habilidad);
    }

    //pongo by id en el controller porque puse by id en angular,k, sino crea una skill nueva el lugar de editar
    //no se si no va como el find y el delete aca
    public void updateSkillA(SkillArq habilidad) {
        saRepo.save(habilidad);
    }

    public void deleteSkillA(Integer id) {
        saRepo.deleteById(id);
    }  

    
}
