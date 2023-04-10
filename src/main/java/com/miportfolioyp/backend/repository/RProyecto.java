
package com.miportfolioyp.backend.repository;

import com.miportfolioyp.backend.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RProyecto  extends JpaRepository<Proyecto, Integer>{

}