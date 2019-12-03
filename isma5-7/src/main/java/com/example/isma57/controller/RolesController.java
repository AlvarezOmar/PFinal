package com.example.isma57.controller;

import com.example.isma57.entity.Roles;
import com.example.isma57.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/apiroles")
public class RolesController {
    @Autowired
    RolesService service;

    @PostMapping("/save")
    public Roles save(@RequestBody Roles roles){
        service.save(roles);
        return roles;
    }

    @PutMapping("/update")
    public Roles updateRoles(@RequestBody Roles uproles) {
        service.Update(uproles);
        return uproles;
    }

    @GetMapping("/list")
    public List<Roles> list(){
        return service.getAllRoles();
    }

    @GetMapping("/list/{id}")
    public Roles getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRoles(@PathVariable (value = "id") Long id){
        service.deleteRoles(id);
        return "Se elimino el id= " +id;
    }

}
