package com.example.aaw.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name= "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(name = "name",nullable = false,length = 45)
    private  String name;

    @Column(name = "lastname",nullable = false,length = 45)
    private  String lastname;
    @Column(name = "peso",nullable = false)
    private  double peso;
    @Column(name = "zise",nullable = false)
    private  double zise;
    @Column(name = "birthdate", nullable = false)
    private LocalDate birthDate;


    private Boolean enabled;

    @Column(name = "sport",nullable = false,length = 45)
    private  String sport;
    @Column(name = "cantGame",nullable = false)
    private int cantGame;


    public Usuario() {
    }

    public Usuario(int idUser, String name, String lastname, double peso, double zise, LocalDate birthDate, Boolean enabled, String sport, int cantGame) {
        this.idUser = idUser;
        this.name = name;
        this.lastname = lastname;
        this.peso = peso;
        this.zise = zise;
        this.birthDate = birthDate;
        this.enabled = enabled;
        this.sport = sport;
        this.cantGame = cantGame;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getZise() {
        return zise;
    }

    public void setZise(double zise) {
        this.zise = zise;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getCantGame() {
        return cantGame;
    }

    public void setCantGame(int cantGame) {
        this.cantGame = cantGame;
    }
}
