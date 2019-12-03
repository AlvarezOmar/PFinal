package com.example.isma57.repository;

import com.example.isma57.entity.Servicios;
import com.example.isma57.service.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServiciosRepositoryImpl implements ServiciosService {

    @Autowired
    ServiciosRepository repository;

    @Override
    public List<Servicios> getAllServicios() {
        return (List<Servicios>)repository.findAll();
    }

    @Override
    public Servicios getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(Servicios servicios) {
        repository.save(servicios);
    }

    @Override
    public void Update(Servicios upservicios) {
        repository.save(upservicios);
    }


    @Override
    public void deleteServicios(Long id) {
        repository.deleteById(id);
    }
}
