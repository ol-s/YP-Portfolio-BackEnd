
package com.miportfolioyp.backend.service;

import com.miportfolioyp.backend.entity.Experiencia;
import com.miportfolioyp.backend.repository.RExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SExperiencia {
    
    @Autowired RExperiencia experienciaRepo;
 
    
    public List<Experiencia> listaExp() {
        return experienciaRepo.findAll();
    }

    public Experiencia findExperiencia(Integer id) {
        return experienciaRepo.findById(id).orElse(null);   
    }
    
    
    public void saveExperiencia(Experiencia textoExperiencia) {
        experienciaRepo.save(textoExperiencia);  
    }

    public void updateExperiencia(Experiencia textoExperiencia) {
        experienciaRepo.save(textoExperiencia);
    }
    
    public void deleteExperiencia(Integer id) {
        experienciaRepo.deleteById(id);
    }

  
}