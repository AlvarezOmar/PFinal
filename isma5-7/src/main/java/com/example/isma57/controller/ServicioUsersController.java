package com.example.isma57.controller;

import com.example.isma57.entity.ServicioUsers;
import com.example.isma57.service.ServicioUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/apiserviciousers")
public class ServicioUsersController {

    @Autowired
    ServicioUsersService service;

    @PostMapping("/save")
    public ServicioUsers save(@RequestBody ServicioUsers serviciousers){
        service.save(serviciousers);
        return serviciousers;
    }

    @PutMapping("/update")
    public ServicioUsers updateServicioUsers(@RequestBody ServicioUsers upserviciousers) {
        service.Update(upserviciousers);
        return upserviciousers;
    }

    @GetMapping("/list")
    public List<ServicioUsers> list(){
        return service.getAllServicioUsers();
    }

    @GetMapping("/list/{id}")
    public ServicioUsers getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteServicioUsers(@PathVariable (value = "id") Long id){
        service.deleteServicioUsers(id);
        return "Se elimino el id= " +id;
    }

}


