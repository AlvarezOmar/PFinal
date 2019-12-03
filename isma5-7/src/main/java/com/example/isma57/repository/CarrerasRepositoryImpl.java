package com.example.isma57.repository;

import com.example.isma57.entity.Carreras;
import com.example.isma57.service.CarrerasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CarrerasRepositoryImpl implements CarrerasService {
    @Autowired
    CarrerasRepository repository;

    @Override
    public List<Carreras> getAllCarreras() {
        return (List<Carreras>)repository.findAll();
    }

    @Override
    public Carreras getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(Carreras carreras) {
        repository.save(carreras);
    }

    @Override
    public void Update(Carreras upcarreras) {
        repository.save(upcarreras);
    }


    @Override
    public void deleteCarreras(Long id) {
        repository.deleteById(id);
    }
}