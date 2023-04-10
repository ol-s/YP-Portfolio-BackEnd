package com.miportfolioyp.backend.repository;

import com.miportfolioyp.backend.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
      //public interface PersonaRepo extends JpaRepository<Persona, Long>{
public interface PersonaRepo extends JpaRepository<Persona, Integer>{ 
     //no se si long o int, lo sacamos del tipo de dato que tiene el id (expres), pero h puso long..?

}
