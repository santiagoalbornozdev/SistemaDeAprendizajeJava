package com.example.sistema.model;

import jakarta.persistence.*;

@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstudiante;
    private String nombre;
    private String nivelInicial;
    private String estiloAprendizaje;

    public Estudiante() {
    }

    public Estudiante(String nombre, String nivelInicial, String estiloAprendizaje) {
        this.nombre = nombre;
        this.nivelInicial = nivelInicial;
        this.estiloAprendizaje = estiloAprendizaje;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivelInicial() {
        return nivelInicial;
    }

    public void setNivelInicial(String nivelInicial) {
        this.nivelInicial = nivelInicial;
    }

    public String getEstiloAprendizaje() {
        return estiloAprendizaje;
    }

    public void setEstiloAprendizaje(String estiloAprendizaje) {
        this.estiloAprendizaje = estiloAprendizaje;
    }
}
