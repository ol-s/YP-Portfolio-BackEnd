
package com.miportfolioyp.backend.service;

import com.miportfolioyp.backend.entity.SkillSoft;
import com.miportfolioyp.backend.repository.RSkillSoft;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkillSoft {
    
   @Autowired RSkillSoft ssRepo;    
    
     public List<SkillSoft> listaSkillsS() {
        return ssRepo.findAll();
    }

    public SkillSoft findSkillS(Integer id) {
        return ssRepo.findById(id).orElse(null);
    }

    public void saveSkillS(SkillSoft habilidad) {
        ssRepo.save(habilidad);
    }

    public void updateSkillS(SkillSoft habilidad) {
        ssRepo.save(habilidad);
    }

    public void deleteSkillS(Integer id) {
        ssRepo.deleteById(id);
    } 
}
