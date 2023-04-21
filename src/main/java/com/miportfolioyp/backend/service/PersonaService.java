//////////////////////////////MIS COLORES///////////////////////////////////////////////
//METODOS FONDO GRIS OSCURO (marcadoen todos los lenguajes, no se si en java lo llama metodo)
//(en java lo marcacomo metodo declaracion y metodo use, ambos con fondo gris mas oscuro)+   
//PARAMETROS DECLARACION DURAZNO (id etc) (marcado en la opcion java, el de abajo tmb)+
//parametrosUse  DURAZNO OSCURO . lleva el mismo nombre que el parametro declaracion
////////////////////////////////////////////////////////////////////////////////////////


package com.miportfolioyp.backend.service;

import com.miportfolioyp.backend.entity.Persona;
import com.miportfolioyp.backend.repository.PersonaRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//ctrl shift i   para agregar todas las importAciones, creo!!!!!!!!!!!!!! FFs

@Service
@Transactional  //sirve para ayudar a la persistencia de datos?  express 18, 48:20', ''ayuda, poner por las dudas''
public class PersonaService {

// autocableado al repositorio PersonaRepo
//'repoPers' es un alias q ponemos nosotros, lo usamos para buscar los metodos
    @Autowired PersonaRepo repoPers;

    
    
//@Override //sobreescribe los datos, para que se usaria? h no lo puso en el final  
    
      
    
    //en express 16 escribieron asi, me quedo en min 50' ''de ahisalen del repositorio? repository? EL RETURN ES DEL EXPRESS?
    //ver persona/crear/borrar/buscar persona tienen  ahi,,,editar es lo mismo que save, poner a[arte es 'buena practica'
    
//    public List<Persona> verPersonas() {
//        List<Persona> listaPersonas = repoPers.findAll();  //findall etc metodos salen del jpa,,,yo no tengo lista de personas tho..
//        return listaPersonas;
//    }
    
    
       

    //-------------------------------------------------------------------------------------------------------------
    public List<Persona> listaPersonas() {       //''VER PERSONAS''
        return repoPers.findAll();              ////////////find deletebyid etc etc METODOS salen del jpa
    }
//    public List<Persona> listaPersonas(){   ------en express esta asi
//    List<Persona> listaPersonas = repoPers.findAll();
//    return listPersonas;}
    
    
    public Persona findPersona(Integer id) {          //'BUSCAR PERSONA''
        return repoPers.findById(id).orElse(null);
    }
 
//    public Persona buscarPersona(int id){   ------en express esta asi
//    Persona perso = repoPers.findById(id).orElse(null);
//    return perso;}
    
        
    
    //'sin create, guarda o crea una nueva', pero el edit es updatePersona soo
    public void savePersona(Persona personaN) {         //''CREAR PERSONA''
        repoPers.save(personaN);
    }
    //hace lo mismo que el de arriba(save), es buena practica diferenciarlos, uno crea, uno edita, express 16, 52', PERO PUEDE NO ESTAR EL UPDATE/EDIT
    public void updatePersona(Persona personaN) {       //''EDITAR PERSONA''
        repoPers.save(personaN);
    }

    public void deletePersona(Integer id) {  //**999*** este 'deletePersona' lo pongo yo, y se tiene que llamar igual en el segundo renglon en el controller
        repoPers.deleteById(id);             //este 'deleteById' viene del JPA ''''PersonaRepo extends JpaRepository<Persona, Integer>'''
    }                                        //y repoPers es el alias ('para utilizarlo en otras capaz se lo nombra con alias' expres 16  1:0:49)
                                             //que tiene aca PersonaRepo, vinculado al JPA como dice mas arriba
    
    
    
    
    
    
    
    //Login------19-4-23
    public Persona loginPersona(String email, String clave) {
        List <Persona> personas = repoPers.findByEmailAndClave(email, clave);
        if(!personas.isEmpty()){
            return personas.get(0); //si la lista no esta vacía devuelve la de la posición 0
        }
        return null;
    }
    
    //login con dto //k ,nope
    /*public PersonaDto loginPersona(String email, String clave){
	Persona persona = persoRepo.findByEmailAndClave(email, clave);
	PersonaDto personaDto = new PersonaDto(persona.getId(), persona.getHola(), persona.getNombre(), persona.getApellido(),persona.getCargo());
	return personaDto;
    }*/
    

}