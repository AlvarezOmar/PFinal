package com.example.isma57.controller;

import com.example.isma57.entity.Carreras;
import com.example.isma57.service.CarrerasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/apicarreras")
public class CarrerasController {
    @Autowired
    CarrerasService service;

    @PostMapping("/save")
    public Carreras save(@RequestBody Carreras carreras){
        service.save(carreras);
        return carreras;
    }

    @PutMapping("/update")
    public Carreras updateCarreras(@RequestBody Carreras upcarreras) {
        service.Update(upcarreras);
        return upcarreras;
    }

    @GetMapping("/list")
    public List<Carreras> list(){
        return service.getAllCarreras();
    }

    @GetMapping("/list/{id}")
    public Carreras getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCarreras(@PathVariable (value = "id") Long id){
        service.deleteCarreras(id);
        return "Se elimino el id= " +id;
    }

}
