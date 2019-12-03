package com.example.isma57.controller;

import com.example.isma57.entity.Usuario;
import com.example.isma57.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/apiusuario")
public class UsuarioController {
    @Autowired
    UsuarioService service;

    @PostMapping("/save")
    public Usuario save(@RequestBody Usuario usuario){
        service.save(usuario);
        return usuario;
    }

    @PutMapping("/update")
    public Usuario updateUsuario(@RequestBody Usuario upusuario) {
        service.Update(upusuario);
        return upusuario;
    }

    @GetMapping("/list")
    public List<Usuario> list(){
        return service.getAllUsuario();
    }

    @GetMapping("/list/{id}")
    public Usuario getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUsuario(@PathVariable (value = "id") Long id){
        service.deleteUsuario(id);
        return "Se elimino el id= " +id;
    }

}

