
package com.miportfolioyp.backend.service;

import com.miportfolioyp.backend.entity.Red;
import com.miportfolioyp.backend.repository.RRed;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SRed {
    
    @Autowired RRed redRepo;
    
    public List<Red> listaRedes() {
        return redRepo.findAll();
    }

    public Red findRed(Integer id) {
        return redRepo.findById(id).orElse(null);   
    }
    
    public void saveRed(Red redes) {
        redRepo.save(redes);   
    }
    
    public void deleteRed(Integer id) {
        redRepo.deleteById(id);
    }
    
    public void updateRed(Red redes) {
        redRepo.save(redes);
    }
         
    
}
