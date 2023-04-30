
package com.miportfolioyp.backend.service;

import com.miportfolioyp.backend.entity.Proyecto;
import com.miportfolioyp.backend.repository.RProyecto;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SProyecto {
       
    @Autowired RProyecto proyectoRepo;


    public List <Proyecto> listaProyectos() {
        return proyectoRepo.findAll();
    }
    
    public Proyecto findProyecto(Integer id) {
        return proyectoRepo.findById(id).orElse(null);   
    }
    
    public void saveProyecto(Proyecto proyecto) { //mismos nombres en el controller
        proyectoRepo.save(proyecto);  
    }  
    
    public void deleteProyecto(Integer id) {
        proyectoRepo.deleteById(id);
    }
    
    public void updateProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);
    }
       
       
}
