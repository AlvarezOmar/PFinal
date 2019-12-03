package com.example.isma57.service;

import com.example.isma57.entity.Roles;

import java.util.List;

public interface RolesService {

    public List<Roles> getAllRoles();

    public Roles getById (Long id);

    public void save (Roles roles);

    public void Update (Roles uproles);

    public void deleteRoles(Long id);
}
