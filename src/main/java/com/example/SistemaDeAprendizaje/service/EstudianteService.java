package com.example.SistemaDeAprendizaje.service;

import com.example.SistemaDeAprendizaje.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SistemaDeAprendizaje.repository.EstudianteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante guardarEstudiante(Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }
    public List<Estudiante> listarTodos(){
        return estudianteRepository.findAll();
    }
    public Optional <Estudiante> buscarPorId(Long id){
        return estudianteRepository.findById(id);
    }
    public void eliminarPorId(Long id) {
        estudianteRepository.deleteById(id);
    }
}
