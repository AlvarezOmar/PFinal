package com.example.isma57.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "tbl_carreras")
@Entity
public class Carreras implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carr_id;

    @Column()
    private String carr_name;

    @Column()
    private String carr_siglas;

    @Column
    private boolean carr_status;

    public Carreras(){

    }

    public Long getCarr_id() {
        return carr_id;
    }

    public void setCarr_id(Long carr_id) {
        this.carr_id = carr_id;
    }

    public String getCarr_name() {
        return carr_name;
    }

    public void setCarr_name(String carr_name) {
        this.carr_name = carr_name;
    }

    public String getCarr_siglas() {
        return carr_siglas;
    }

    public void setCarr_siglas(String carr_siglas) {
        this.carr_siglas = carr_siglas;
    }

    public boolean isCarr_status() {
        return carr_status;
    }

    public void setCarr_status(boolean carr_status) {
        this.carr_status = carr_status;
    }
}
