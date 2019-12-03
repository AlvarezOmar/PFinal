package com.example.isma57.repository;

import com.example.isma57.entity.Categorias;
import com.example.isma57.service.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoriasRepositoryImpl implements CategoriasService {

    @Autowired
    CategoriasRepository repository;

    @Override
    public List<Categorias> getAllCategorias() {
        return (List<Categorias>)repository.findAll();
    }

    @Override
    public Categorias getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(Categorias categorias) {
        repository.save(categorias);
    }

    @Override
    public void Update(Categorias upcategorias) {
        repository.save(upcategorias);
    }


    @Override
    public void deleteCategorias(Long id) {
        repository.deleteById(id);
    }
}
