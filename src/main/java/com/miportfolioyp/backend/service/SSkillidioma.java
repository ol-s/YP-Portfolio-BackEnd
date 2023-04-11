
package com.miportfolioyp.backend.service;

import com.miportfolioyp.backend.entity.Skillidioma;
import com.miportfolioyp.backend.repository.RSkillidioma;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkillidioma {
    
    @Autowired RSkillidioma siRepo;    
    
     public List<Skillidioma> listaSkillsD() {
        return siRepo.findAll();
    }

    public Skillidioma findSkillD(Integer id) {
        return siRepo.findById(id).orElse(null);
    }

    public void saveSkillD(Skillidioma habilidad) {
        siRepo.save(habilidad);
    }

    public void updateSkillD(Skillidioma habilidad) {
        siRepo.save(habilidad);
    }

    public void deleteSkillD(Integer id) {
        siRepo.deleteById(id);
    } 
}

