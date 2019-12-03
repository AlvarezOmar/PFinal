package com.example.isma57.service;

import com.example.isma57.entity.Categorias;

import java.util.List;

public interface CategoriasService {

    public List<Categorias> getAllCategorias();

    public Categorias getById (Long id);

    public void save (Categorias categorias);

    public void Update (Categorias upcategorias);

    public void deleteCategorias(Long id);
}
