package com.miportfolioyp.backend.service;

import com.miportfolioyp.backend.entity.Persona;
import com.miportfolioyp.backend.repository.PersonaRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional  // para ayudar a la persistencia de datos
public class PersonaService {

    @Autowired PersonaRepo repoPers;

    public List<Persona> listaPersonas() {       
        return repoPers.findAll();              
    }
       
    public Persona findPersona(Integer id) {          
        return repoPers.findById(id).orElse(null);
    }
    
    public void savePersona(Persona personaN) {        
        repoPers.save(personaN);
    }
   
    public void updatePersona(Persona personaN) {    
        repoPers.save(personaN);
    }

    public void deletePersona(Integer id) {  
        repoPers.deleteById(id);             
    }                                        
    
    
    
    //Login 19-4-23
    public Persona loginPersona(String email, String clave) {
        List <Persona> personas = repoPers.findByEmailAndClave(email, clave);
        if(!personas.isEmpty()){
            return personas.get(0); //si la lista no esta vacía devuelve la de la posición 0
        }
        return null;
    }

}