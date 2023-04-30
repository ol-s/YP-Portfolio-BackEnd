
package com.miportfolioyp.backend.service;

import com.miportfolioyp.backend.entity.Educacion;
import com.miportfolioyp.backend.repository.REducacion;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired REducacion eduRepo;

    public List<Educacion> listaEstudios() {
        return eduRepo.findAll();
    }

    public Educacion findEducacion(Integer id) {
        return eduRepo.findById(id).orElse(null);   
    }
    
    public void saveEducacion(Educacion estudio) {
        eduRepo.save(estudio);   
    }
    
    public void deleteEducacion(Integer id) {
        eduRepo.deleteById(id);
    }
    
    public void updateEducacion(Educacion estudio) {
        eduRepo.save(estudio);
    }  
    
}
