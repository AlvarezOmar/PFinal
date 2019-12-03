package com.example.isma57.repository;

import com.example.isma57.entity.ServicioUsers;
import com.example.isma57.service.ServicioUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServicioUsersRepositoryImpl implements ServicioUsersService {
    @Autowired
    ServicioUsersRepository repository;

    @Override
    public List<ServicioUsers> getAllServicioUsers() {
        return (List<ServicioUsers>)repository.findAll();
    }

    @Override
    public ServicioUsers getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void save(ServicioUsers serviciousers) {
        repository.save(serviciousers);
    }

    @Override
    public void Update(ServicioUsers upserviciousers) {
        repository.save(upserviciousers);
    }


    @Override
    public void deleteServicioUsers(Long id) {
        repository.deleteById(id);
    }
}