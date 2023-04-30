package com.miportfolioyp.backend.repository;

import com.miportfolioyp.backend.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
      
public interface PersonaRepo extends JpaRepository<Persona, Integer>{ 
     // int, del tipo de dato que tiene el id 
    
    //login 19-4-23
    public List <Persona> findByEmailAndClave(String email, String clave);
    
}
