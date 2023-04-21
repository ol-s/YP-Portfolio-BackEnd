// ---------------al crear repositories va new /interface, el resto va new/class
/////////////////////////controlador conectado al servicio, servicio conectado al repository y el repo conectado a la base de datos///masterclass 8

package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.Persona;
import com.miportfolioyp.backend.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//express 16, 59.40' el primer persona sin barra, porque el localhost8080 ya trae, EL RESTO CON BARRA, XQ VIENE DETRAS DE persona
//'@' son anotations

@RestController //asi la identifica la capa, solo 'controller' da error en postman etc,,,,,hay q tener postman instalado ya
@RequestMapping("persona") //la ruta sera http://localhost:8080/persona con barra o no?--si?-- en express no pusieron, en ghub h puso

@CrossOrigin("http://localhost:4200/")
//4200 es porque se tiene que cruzar con angular!!
//(origins = {"https://miportfolioyp-backend.web.app  ,,,,??? es a eleccion??,,, ","http://localhost:4200"}) 

public class PersonaController {
       
     @Autowired PersonaService  persoServicio;    //persoservicio es alias, PersonaService es el servicio que hicimos para Persona
      

    @GetMapping("/lista")   //va a ser http://localhost:8080/persona/lista,,,, no se si va el parentesis ahi, de nuevo?
    @ResponseBody          //responde con el cuerpo de este, el requerimiento del getmapping(?)
    public List<Persona> listaPersonas(){   //es ''get personas''  //este no sale del jpa, pero es metodo, no se como anda tho?
       return persoServicio.listaPersonas();  
    }
    
    //para ver las personas 
    @GetMapping("/find/{id}")     /////////////////////////de nuevo, ojo con las barras, van o no?
    @ResponseBody 
    public Persona findPersona(@PathVariable int id){
        return persoServicio.findPersona(id);  
    }
        
    
    //este no lleva {id} porque esta creando un usuario nuevo, update lleva porque ya hay un id persona guardado
    //@RequestBody es para recibir una persona nueva , viene de un json
    //postmapping,,,ya no estamos -get- requiriendo datos del servidor sino enviando, estamos creando persona/estudio/proyecto etc
    @PostMapping ("/new")
    @ResponseBody
    public String savePersona(@RequestBody Persona personaN){      //string aca arriba porque retorna un string, sino pongo void
        persoServicio.savePersona(personaN);
        return "Usuario creado"; 
        // return "Persona-Usuario creado";          //el return estaba en el AP apunte, ver mas abajo
                                                     
    }
    
    
    //para editar, hmmmmmmm, no va id en el parametro????????? parece que no, cos es igual al save pero lo escribimos diferenciado
    //ver edit de AP mas abajo
    //@PutMapping("/update/{id}")    //h le saco el {id} en el express y gh
//    @PutMapping("/update")
//    public String updatePersona(@RequestBody Persona personaN){
//        persoServicio.updatePersona(personaN); //**999*** este 'updatePersona' es el que se tiene que llamar igual que en el servicio, ojo, no el de arriba
//        return "Usuario actualizado";
//        //return new ResponseEntity(HttpStatus.OK);
//    }                                          //**999*** y siiii, dice PERSOSERVICIOOOOOO PUNTO XXXX,,, (:  POR APURADA VES
    
    @PutMapping("/update/{id}")
    public String updatePersona(@PathVariable int id, @RequestBody Persona personaN){
        persoServicio.updatePersona(personaN); //**999*** este 'updatePersona' es el que se tiene que llamar igual que en el servicio, ojo, no el de arriba
        return "Usuario actualizado";
        //return new ResponseEntity(HttpStatus.OK);
    } 
    
    
    //@PathVariable es ruta variable, dinamica,varia el id
    @DeleteMapping("/delete/{id}")
    public String deletePersona(@PathVariable int id){
        persoServicio.deletePersona(id);
        return "Usuario eliminado";
    }
    
    
    
    
     //Login 19-4-23
    /*delservicio autenticacion en angular 
     export class AutenticacionService {
     url = 'http://localhost:8080/persona/autenticacion/login'*/
    @PostMapping ("/autenticacion/login")
    @ResponseBody
    public Persona loginPersona(@RequestBody Persona pers) {
        return persoServicio.loginPersona(pers.getEmail(), pers.getClave());
    }
    
}
    

   
    //---------------------------------------------------------------------APAGO PERO ESTA OKOK NOW
    //sin return, save delete edit dan error aca (!!!no habia puesto el nombre declarado en el servicio!!), dice crear metodo en PersonaService, APAGO
//
//    @PostMapping("/create")
//    public void save(@RequestBody Persona persona){
//        persoServicio.savePersona(persona);
//    }
//      
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable int id){
//        persoServicio.deletePersona(id);
//    }
//   
//    @PutMapping("/update")
//    public void edit(@RequestBody Persona persona){   
//        persoServicio.updatePersona(persona);  
//        ////////ojoooooooo EN EL SEGUNDO RENGLON!, ***999*** no 'edit',si 'updatePersona' que es como lo llame en el servicio, el edit de ariba lo llamo como kiera
//    }
        
    
    
   //----------------------------------------------   editar mas largo, del apunte AP 
//@PutMapping ("/update/{id}")

//public Persona editPersona (@PathVariable Long id,
//@RequestParam ("nombre") String nuevoNombre,
//@RequestParam ("apellido") String nuevoApellido,
//@RequestParam ("edad") int nuevaEdad) {
//
//Persona perso = PersonaController.findPersona(id); //no se si va personacontroller o cual aca, da errores o importar/crear clase/metodo en otro lado
//
//perso.setApellido(nuevoApellido);
//perso.setNombre(nuevoNombre) ;
//perso.setEdad(nuevaEdad);
//
//PersonaController.savePersona(perso);
//
//return perso;
    
    
    
    
    
    
    
  
    
    
//    //Login--------------------------------------------------------------------------------k
//    @PostMapping ("auth/login")   //puse auth
//    @ResponseBody
//    public PersonaDto loginPersona(@RequestBody Persona perso) {
//        return persoServicio.loginPersona(perso.getEmail(), perso.getClave());
//    }
    









//apunte AP-----------------------------------------------------------------

/*
@RestController
public class PersonaController {

@Autowired
private IPersonaService interPersona;

@GetMapping ("/personas/traer™)
public List<Persona> getPersonas() {

return interPersona.getPersonas();

}

@PostMapping ("/personas/crear™)
public String createStudent(@RequestBody Persona perso) {

interPersona.savePersona(perso);

return "La persona fue creada correctamente";

}

@DeleteMapping ("/personas/borrar/{id}")
public String deletePersona (@PathVariable Long id) {

interPersona.deletePersona(id);

return "La persona fue eliminada correctamente";

}

@PutMapping (“"personas/editar/{id}")

public Persona editPersona (@PathVariable Long id,
@RequestParam ("nombre") String nuevoNombre,
@RequestParam ("apellido") String nuevoApellido,
@RequestParam ("edad") int nuevaEdad) {

Persona perso = interPersona.findPersona(id);

perso.setApellido(nuevoApellido);
perso.setNombre(nuevoNombre) ;
perso.setEdad(nuevaEdad);

interPersona.savePersona(perso);

return perso;

*/

