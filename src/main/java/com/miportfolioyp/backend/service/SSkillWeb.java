
package com.miportfolioyp.backend.service;

import com.miportfolioyp.backend.entity.SkillWeb;
import com.miportfolioyp.backend.repository.RSkillWeb;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkillWeb {
  
    @Autowired RSkillWeb swRepo;    
    
     public List<SkillWeb> listaSkillsW() {
        return swRepo.findAll();
    }

    public SkillWeb findSkillW(Integer id) {
        return swRepo.findById(id).orElse(null);
    }

    public void saveSkillW(SkillWeb habilidad) {
        swRepo.save(habilidad);
    }

    public void updateSkillW(SkillWeb habilidad) {
        swRepo.save(habilidad);
    }

    public void deleteSkillW(Integer id) {
        swRepo.deleteById(id);
    } 
    
}

