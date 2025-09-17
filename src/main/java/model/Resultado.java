package model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Resultado {
    @Id
    @GeneratedValue
    private Long idResultado;
    private Boolean aprobado;
    private Date fechaEvaluacion;

    @OneToOne(mappedBy = "resultado")
    private Evaluacion evaluacion;

    public Resultado() {
    }

    public Resultado(Boolean aprobado, Date fechaEvaluacion, Evaluacion evaluacion) {
        this.aprobado = aprobado;
        this.fechaEvaluacion = fechaEvaluacion;
        this.evaluacion = evaluacion;
    }

    public Long getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(Long idResultado) {
        this.idResultado = idResultado;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Date getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(Date fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }
}
