package com.miportfolioyp.backend.repository;

import com.miportfolioyp.backend.entity.ProyectoWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyectoWeb extends JpaRepository<ProyectoWeb, Integer>{
    
}
