package com.example.aaw.demo.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class UserDTO {
    private int idUser;

    @Column(name = "name",nullable = false,length = 45)
    private  String name;

    private  String lastname;
    private  double peso;
    private  double zise;
    private LocalDate birthDate;
    private Boolean enabled;

    private  String sport;
    private int cantGame;

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
