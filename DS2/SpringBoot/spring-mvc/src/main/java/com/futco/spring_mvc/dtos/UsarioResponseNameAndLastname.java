package com.futco.spring_mvc.dtos;

public class UsarioResponseNameAndLastname {
    private String nombreCompleto;

    public UsarioResponseNameAndLastname() {
    }

    public UsarioResponseNameAndLastname(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
