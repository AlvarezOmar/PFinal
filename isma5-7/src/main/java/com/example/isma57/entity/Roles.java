package com.example.isma57.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "tbl_roles")
@Entity
public class Roles implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rol_id;

    @Column()
    private String rol_type;

    @Column
    private boolean rol_status;

    public Roles(){

    }

    public Long getRol_id() {
        return rol_id;
    }

    public void setRol_id(Long rol_id) {
        this.rol_id = rol_id;
    }

    public String getRol_type() {
        return rol_type;
    }

    public void setRol_type(String rol_type) {
        this.rol_type = rol_type;
    }

    public boolean isRol_status() {
        return rol_status;
    }

    public void setRol_status(boolean rol_status) {
        this.rol_status = rol_status;
    }
}
