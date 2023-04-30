
package com.miportfolioyp.backend.service;

import com.miportfolioyp.backend.entity.ProyectoWeb;
import com.miportfolioyp.backend.repository.RProyectoWeb;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectoWeb {
 
@Autowired RProyectoWeb proyWebRepo;    
 
    public List <ProyectoWeb> listaProyectos() {
        return proyWebRepo.findAll();
    }
    
    public ProyectoWeb findProyecto(Integer id) {
        return proyWebRepo.findById(id).orElse(null);   
    }
    
    public void saveProyecto(ProyectoWeb proyecto) {
        proyWebRepo.save(proyecto);  
    }  
    
    public void deleteProyecto(Integer id) {
        proyWebRepo.deleteById(id);
    }
    
    public void updateProyecto(ProyectoWeb proyecto) {
        proyWebRepo.save(proyecto);
    }
       
       
}