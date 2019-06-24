package com.riscodavila.rest.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username", length = 32, nullable = false)
    private String username;

    @Column(name = "password", length = 18, nullable = false)
    private String password;

    @Column(name = "nombre", length = 18, nullable = false)
    private String nombre;

    @Temporal(TemporalType.DATE)
    @Column(name = "birthdate", nullable = false)
    private Date birthday;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_time", nullable = false)
    private Date createdTime;

    @PrePersist
    void preInsert() {
        if (this.createdTime == null)
            this.createdTime = new Date();
    }

    public Usuario() {
    }

    public Usuario(String username, String password, String nombre, Date birthday, Date createdTime) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.birthday = birthday;
        this.createdTime = createdTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
