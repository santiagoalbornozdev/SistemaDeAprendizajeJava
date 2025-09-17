package com.example.sistema.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Modulo {
    @Id
    @GeneratedValue
    private Long idModulo;
    private String titulo;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @OneToMany(mappedBy = "modulo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Leccion> lecciones = new ArrayList<>();

    public Modulo() {
    }
    public Modulo(String titulo, Curso curso) {
        this.titulo = titulo;
        this.curso = curso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Long getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Long idModulo) {
        this.idModulo = idModulo;
    }

    public List<Leccion> getlecciones() {
        return lecciones;
    }

    public void setlecciones(List<Leccion> lecciones) {
        this.lecciones = lecciones;
    }
}
