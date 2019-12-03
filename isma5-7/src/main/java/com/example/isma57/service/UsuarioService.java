package com.example.isma57.service;

import com.example.isma57.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> getAllUsuario();

    public Usuario getById (Long id);

    public void save (Usuario usuario);

    public void Update (Usuario upusuario);

    public void deleteUsuario(Long id);
}
