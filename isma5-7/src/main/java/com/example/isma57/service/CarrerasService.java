package com.example.isma57.service;

import com.example.isma57.entity.Carreras;

import java.util.List;

public interface CarrerasService {

    public List<Carreras> getAllCarreras();

    public Carreras getById (Long id);

    public void save (Carreras carreras);

    public void Update (Carreras upcarreras);

    public void deleteCarreras(Long id);



}
