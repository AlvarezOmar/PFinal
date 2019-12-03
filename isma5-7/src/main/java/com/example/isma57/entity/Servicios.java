package com.example.isma57.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "tbl_servicios")
@Entity
public class Servicios implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serv_id;

    @Column()
    private String serv_name;

    @Column()
    Long cat_id;

    @Column
    private boolean serv_status;

    @Column()
    Long us_id;

    public Servicios(){

    }

    public Long getServ_id() {
        return serv_id;
    }

    public void setServ_id(Long serv_id) {
        this.serv_id = serv_id;
    }

    public String getServ_name() {
        return serv_name;
    }

    public void setServ_name(String serv_name) {
        this.serv_name = serv_name;
    }

    public Long getCat_id() {
        return cat_id;
    }

    public void setCat_id(Long cat_id) {
        this.cat_id = cat_id;
    }

    public boolean isServ_status() {
        return serv_status;
    }

    public void setServ_status(boolean serv_status) {
        this.serv_status = serv_status;
    }

    public Long getUs_id() {
        return us_id;
    }

    public void setUs_id(Long us_id) {
        this.us_id = us_id;
    }
}