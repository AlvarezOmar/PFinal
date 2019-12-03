package com.example.isma57.controller;

import com.example.isma57.entity.Servicios;
import com.example.isma57.service.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/apiservicios")
public class ServiciosController {
    @Autowired
    ServiciosService service;

    @PostMapping("/save")
    public Servicios save(@RequestBody Servicios servicios){
        service.save(servicios);
        return servicios;
    }

    @PutMapping("/update")
    public Servicios updateServicios(@RequestBody Servicios upservicios) {
        service.Update(upservicios);
        return upservicios;
    }

    @GetMapping("/list")
    public List<Servicios> list(){
        return service.getAllServicios();
    }

    @GetMapping("/list/{id}")
    public Servicios getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteServicios(@PathVariable (value = "id") Long id){
        service.deleteServicios(id);
        return "Se elimino el id= " +id;
    }

}

