package com.example.SistemaDeAprendizaje.model;

import jakarta.persistence.*;

@Entity
public class InformeRendimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInforme;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    private String curso;
    private Double progresoGeneral;

    public InformeRendimiento() {}

    public InformeRendimiento(Estudiante estudiante, String curso, Double progresoGeneral) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.progresoGeneral = progresoGeneral;
    }

    public Long getIdInforme() {
        return idInforme;
    }

    public void setIdInforme(Long idInforme) {
        this.idInforme = idInforme;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getProgresoGeneral() {
        return progresoGeneral;
    }

    public void setProgresoGeneral(Double progresoGeneral) {
        this.progresoGeneral = progresoGeneral;
    }
}