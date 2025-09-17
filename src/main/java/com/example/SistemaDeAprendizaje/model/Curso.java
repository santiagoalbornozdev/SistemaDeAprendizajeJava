package com.example.SistemaDeAprendizaje.model;

import jakarta.persistence.*;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //- usa la estrategia de autoincremento propia del motor de base de datos - - Cuando insertás un nuevo Curso, no necesitás asignarle un idCurso manualmente. La base de datos lo genera automáticamente.


    private  Long idCurso;
    private String nombre;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    //constructor vacio requerido por JPA
    public Curso() {
    }

    //Constructor con parametros

    public Curso(String nombre, String descripcion, Instructor instructor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.instructor = instructor;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
