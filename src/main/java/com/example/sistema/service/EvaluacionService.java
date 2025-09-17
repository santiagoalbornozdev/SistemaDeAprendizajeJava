package com.example.sistema.service;

import com.example.sistema.model.Evaluacion;
import com.example.sistema.repository.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluacionService {
    @Autowired
    private EvaluacionRepository evaluacionRepository;

    public Evaluacion guardarEvaluacion(Evaluacion evaluacion){
        return evaluacionRepository.save(evaluacion);
    }
    public List<Evaluacion> ListarTodos(){
        return evaluacionRepository.findAll();
    }
    public Optional<Evaluacion> buscarPorId(Long id){
        return evaluacionRepository.findById(id);
    }
    public void eliminarPorId(Long id){
        evaluacionRepository.deleteById(id);
    }
}
