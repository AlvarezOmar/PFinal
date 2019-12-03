package com.example.isma57.service;

import com.example.isma57.entity.Servicios;

import java.util.List;

public interface ServiciosService {

    public List<Servicios> getAllServicios();

    public Servicios getById (Long id);

    public void save (Servicios servicios);

    public void Update (Servicios upservicios);

    public void deleteServicios(Long id);
}
