package com.example.sistema.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;


@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInstructor;
    private String nombre;
    private String email;

    @OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Curso> cursos = new ArrayList<>();

    public Instructor(){
    }

    public Instructor(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public Long getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(Long idInstructor) {
        this.idInstructor = idInstructor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        curso.setInstructor(this);
    }
}
