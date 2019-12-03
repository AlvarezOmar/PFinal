package com.example.isma57.repository;

import com.example.isma57.entity.Usuario;
import com.example.isma57.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UsuarioRepositoryImpl implements UsuarioService {
    @Autowired
    UsuarioRepository repository;

    @Override
    public List<Usuario> getAllUsuario() {
        return (List<Usuario>)repository.findAll();
    }

    @Override
    public Usuario getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(Usuario usuario) {
        repository.save(usuario);
    }

    @Override
    public void Update(Usuario upusuario) {
        repository.save(upusuario);
    }


    @Override
    public void deleteUsuario(Long id) {
        repository.deleteById(id);
    }
}

