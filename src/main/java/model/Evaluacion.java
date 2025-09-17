package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Evaluacion {
    @Id
    @GeneratedValue
    private Long idEvaluacion;
    private String tipo;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "evaluacion_id")
    private List<Pregunta> preguntas = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "resultado_id")
    private Resultado resultado;

    public Evaluacion() {
    }

    public Evaluacion(String tipo, List<Pregunta> preguntas, Resultado resultado) {
        this.tipo = tipo;
        this.preguntas = preguntas;
        this.resultado = resultado;
    }

    public Long getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(Long idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
}
