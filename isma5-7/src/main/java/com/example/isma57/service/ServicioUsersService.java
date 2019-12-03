package com.example.isma57.service;

import com.example.isma57.entity.ServicioUsers;

import java.util.List;

public interface ServicioUsersService {

    public List<ServicioUsers> getAllServicioUsers();

    public ServicioUsers getById (Long id);

    public void save (ServicioUsers serviciousers);

    public void Update (ServicioUsers upserviciousers);

    public void deleteServicioUsers(Long id);
}
