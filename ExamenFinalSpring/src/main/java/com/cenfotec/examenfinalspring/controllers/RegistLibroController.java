package com.cenfotec.examenfinalspring.controllers;


import com.cenfotec.examenfinalspring.entities.RegistLibros;
import com.cenfotec.examenfinalspring.services.RegLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/libros"})
public class RegistLibroController {
    @Autowired
    RegLibroService libroService;

    @GetMapping
    public List getAll(){
        return libroService.getAll();
    }
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<RegistLibros> findById(@PathVariable long id){
        Optional<RegistLibros> result = libroService.findById(id);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public RegistLibros create(@RequestBody RegistLibros libros){
        return libroService.save(libros).get();
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<RegistLibros> update(@PathVariable("id") long id,
                                            @RequestBody RegistLibros libros){
        libros.setId(id);
        Optional<RegistLibros> result = libroService.update(libros);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        if (libroService.delete(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
