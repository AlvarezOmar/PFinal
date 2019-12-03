package com.example.isma57.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Table(name = "tbl_servi_users")
@Entity
public class ServicioUsers implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_serv_user;

    @Column()
    Long serv_id;

    @Column(name = "created_id", nullable = false)
    @CreationTimestamp
    private LocalDateTime fec_serv;

    @Column
    private boolean status_serv;

    @Column()
    Long us_id;

    public ServicioUsers(){

    }

    public Long getId_serv_user() {
        return id_serv_user;
    }

    public void setId_serv_user(Long id_serv_user) {
        this.id_serv_user = id_serv_user;
    }

    public Long getServ_id() {
        return serv_id;
    }

    public void setServ_id(Long serv_id) {
        this.serv_id = serv_id;
    }

    public LocalDateTime getFec_serv() {
        return fec_serv;
    }

    public void setFec_serv(LocalDateTime fec_serv) {
        this.fec_serv = fec_serv;
    }

    public boolean isStatus_serv() {
        return status_serv;
    }

    public void setStatus_serv(boolean status_serv) {
        this.status_serv = status_serv;
    }

    public Long getUs_id() {
        return us_id;
    }

    public void setUs_id(Long us_id) {
        this.us_id = us_id;
    }
}
