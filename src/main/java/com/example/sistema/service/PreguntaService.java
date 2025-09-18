package com.example.sistema.service;

import com.example.sistema.model.Pregunta;
import com.example.sistema.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    public Pregunta guardarPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    public List<Pregunta> listarTodas() {
        return preguntaRepository.findAll();
    }

    public Optional<Pregunta> buscarPorId(Long id) {
        return preguntaRepository.findById(id);
    }

    public void eliminarPorId(Long id) {
        preguntaRepository.deleteById(id);
    }
}