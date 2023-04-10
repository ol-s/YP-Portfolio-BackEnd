
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
    
    //----------k
    @Autowired RRed redRepo;
    
    public List<Red> listaRedes() {
    //public List<Red> getRedes() {
        return redRepo.findAll();
    }

    public Red findRed(Integer id) {
        return redRepo.findById(id).orElse(null);   
    }
    
    //crea o guarda nueva?  saveRed es create?
    public void saveRed(Red redes) {
        redRepo.save(redes);    //linea pOSTMAN error, ffs
    }
    
    public void deleteRed(Integer id) {
        redRepo.deleteById(id);
    }
    
    //update edit, si pongo edit cambiar en el Controller
    public void updateRed(Red redes) {
        redRepo.save(redes);
    }
         
    
}
