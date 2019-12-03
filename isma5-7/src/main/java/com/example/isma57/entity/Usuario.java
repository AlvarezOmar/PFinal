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

@Table(name = "tbl_usuario")
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long us_id;

    @NotEmpty
    @Column()
    private String us_name;

    @NotEmpty
    @Column()
    private String us_lastname;

    @Column()
    private String us_gengre;

    @Column()
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date us_fecNac;

    @NotNull
    @Column()
    private String us_phone;

    @NotEmpty
    @Email()
    private String us_email;

    @Column()
    Long carrera_id;

    @Column()
    private String us_alias;

    @NotEmpty
    @Length(min = 10, max = 24)
    private String us_password;

    @Column()
    Long rol_id;

    @Column
    private boolean us_status;

    @Column(name = "created_id", nullable = false)
    @CreationTimestamp
    private LocalDateTime us_fecReg;

    @Column
    private boolean delete;

    public Usuario(){

    }

    public Long getUs_id() {
        return us_id;
    }

    public void setUs_id(Long us_id) {
        this.us_id = us_id;
    }

    public String getUs_name() {
        return us_name;
    }

    public void setUs_name(String us_name) {
        this.us_name = us_name;
    }

    public String getUs_lastname() {
        return us_lastname;
    }

    public void setUs_lastname(String us_lastname) {
        this.us_lastname = us_lastname;
    }

    public String getUs_gengre() {
        return us_gengre;
    }

    public void setUs_gengre(String us_gengre) {
        this.us_gengre = us_gengre;
    }

    public Date getUs_fecNac() {
        return us_fecNac;
    }

    public void setUs_fecNac(Date us_fecNac) {
        this.us_fecNac = us_fecNac;
    }

    public String getUs_phone() {
        return us_phone;
    }

    public void setUs_phone(String us_phone) {
        this.us_phone = us_phone;
    }

    public String getUs_email() {
        return us_email;
    }

    public void setUs_email(String us_email) {
        this.us_email = us_email;
    }

    public Long getCarrera_id() {
        return carrera_id;
    }

    public void setCarrera_id(Long carrera_id) {
        this.carrera_id = carrera_id;
    }

    public String getUs_alias() {
        return us_alias;
    }

    public void setUs_alias(String us_alias) {
        this.us_alias = us_alias;
    }

    public String getUs_password() {
        return us_password;
    }

    public void setUs_password(String us_password) {
        this.us_password = us_password;
    }

    public Long getRol_id() {
        return rol_id;
    }

    public void setRol_id(Long rol_id) {
        this.rol_id = rol_id;
    }

    public boolean isUs_status() {
        return us_status;
    }

    public void setUs_status(boolean us_status) {
        this.us_status = us_status;
    }

    public LocalDateTime getUs_fecReg() {
        return us_fecReg;
    }

    public void setUs_fecReg(LocalDateTime us_fecReg) {
        this.us_fecReg = us_fecReg;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }
}
