package com.example.isma57.repository;

import com.example.isma57.entity.Roles;
import com.example.isma57.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RolesRepositoryImpl  implements RolesService {

    @Autowired
    RolesRepository repository;

    @Override
    public List<Roles> getAllRoles() {
        return (List<Roles>)repository.findAll();
    }

    @Override
    public Roles getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(Roles roles) {
        repository.save(roles);
    }

    @Override
    public void Update(Roles uproles) {
        repository.save(uproles);
    }


    @Override
    public void deleteRoles(Long id) {
        repository.deleteById(id);
    }

}

