package com.example.isma57.controller;

import com.example.isma57.entity.Categorias;
import com.example.isma57.service.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/apicategorias")
public class CategoriasController {
    @Autowired
    CategoriasService service;

    @PostMapping("/save")
    public Categorias save(@RequestBody Categorias categorias){
        service.save(categorias);
        return categorias;
    }

    @PutMapping("/update")
    public Categorias updateCategorias(@RequestBody Categorias upcategorias) {
        service.Update(upcategorias);
        return upcategorias;
    }

    @GetMapping("/list")
    public List<Categorias> list(){
        return service.getAllCategorias();
    }

    @GetMapping("/list/{id}")
    public Categorias getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCategorias(@PathVariable (value = "id") Long id){
        service.deleteCategorias(id);
        return "Se elimino el id= " +id;
    }

}
