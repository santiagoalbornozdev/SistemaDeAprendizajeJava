package com.example.sistema.model;

import jakarta.persistence.*;

@Entity
public class Leccion {
    //linkeo entity y generar valores
    //declaro mis atributos
    @Id
    @GeneratedValue
    private Long idLeccion;
    private String titulo;
    private String contenido;
    //establezco relacion de modulo
    @ManyToOne
    @JoinColumn(name = "modulo_id")
    private Modulo modulo;
    //establezco relacion de evaluacion
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "evaluacion_id")
    private Evaluacion evaluacion;

    public Leccion() {
    }

    public Leccion(String titulo, String contenido, Modulo modulo, Evaluacion evaluacion) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.modulo = modulo;
        this.evaluacion = evaluacion;
    }

    public Long getIdLeccion() {
        return idLeccion;
    }

    public void setIdLeccion(Long idLeccion) {
        this.idLeccion = idLeccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }
}
