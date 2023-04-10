
package com.miportfolioyp.backend.controller;

import com.miportfolioyp.backend.entity.Red;
import com.miportfolioyp.backend.service.SRed;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
//(origins = {"https://miportfolioyp.web.app","http://localhost:4200"})
//@CrossOrigin(origins = "https://miportfolioyp.web.app/")

@CrossOrigin("http://localhost:4200/")  //para cruzar con angular
@RequestMapping("red") //localhost:8080/red
public class CRed {
    
    //controller conectada al servicio, servicio al repo y repo a la db
    @Autowired
    SRed redServicio;
    
    @GetMapping("/lista")
    @ResponseBody 
    public List<Red> listaRedes(){
        return redServicio.listaRedes();  
    }
    
    //para ver las redes 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Red findRed(@PathVariable int id){
        //si retorna vacío no pasa nada
        return redServicio.findRed(id);  
    }
    
    //@RequestBody es para recibir una red nueva. viene en un json
    @PostMapping ("/new")
    @ResponseBody
    public String saveRed(@RequestBody Red redes){
        redServicio.saveRed(redes);
        return "Red creada";
            //return ResponseEntity.ok().body(redes);
    
    }
       
    //editar red
    //ok, es un lio en postman poniendo el id, como que tenes que guardar con cada new id? si id lo pones en el cuerpo del json, editar id tanto, NO SE PONEEL IDAL CREAR, OJO!!
    //@PutMapping("/update/{id}") ,,,LOL, IGUAL EL DELETE TENES Q HACER CON ID SOOO (:
    //hmmmmmmm, parece que en el formulario (DELETE)tenemos que poner un input ''editar xxx de id tanto'' hidden para que no vea el usuario, pero el que edita tiene q poner que id kiere borrar (?) eh?
    //y los botones (EDIT)tienen una etiqueta de identificacion propia que lo relacionamos al id en el json
    //perooooooooooooooooooooo el postman te crea cualquien id, o sea , pones crear/eliminar/crear, y TE PONE UN ID NUEVO!!  :/
    //express 17 , min 29'https://www.youtube.com/watch?v=ERzG5W7BWAs&list=PL1oXSbt2OIbG2ipcgJLQ8P64rwS-bz9tZ&index=20
    //el ngfor en angular deberia traer los botones con su correspondiente id..H,,, PERO NO LE PUSE PIPES AL NOMBRE DEL BOTON, DEBERIA HACER ESO
    @PutMapping("/update") 
    public String updateRed(@RequestBody Red redes){
        redServicio.updateRed(redes);
        return "Red actualizada";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    //borrar red
    @DeleteMapping("/delete/{id}")
    public String deleteRed(@PathVariable int id){     //che en el expres esto esta asi (@PathVariable ("id") int id)???
        redServicio.deleteRed(id);
        return "Red eliminada";
        //return new ResponseEntity(HttpStatus.OK);
    }
    
    
    ////UPDATE POR ID, EXPRESS 18 MIN33'....nvm, no anda,,,actualiza la red con id 7 en NULL NULL NULL
//     @PutMapping("/update/{id}") 
//    public String updateRed(@PathVariable ("id") int id, Red redes ){
//        redServicio.updateRed(redes);
//        return "Red actualizada, por id, sobreescribe o no?";
//        //return new ResponseEntity(HttpStatus.OK);
//    }
    
}

