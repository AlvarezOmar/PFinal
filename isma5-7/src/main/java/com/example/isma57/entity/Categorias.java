package com.example.isma57.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "tbl_categoria_serv")
@Entity
public class Categorias implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cat_id;

    @Column()
    private String cat_name;

    @Column
    private boolean cat_status;

    public Categorias(){

    }

    public Long getCat_id() {
        return cat_id;
    }

    public void setCat_id(Long cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public boolean isCat_status() {
        return cat_status;
    }

    public void setCat_status(boolean cat_status) {
        this.cat_status = cat_status;
    }
}
