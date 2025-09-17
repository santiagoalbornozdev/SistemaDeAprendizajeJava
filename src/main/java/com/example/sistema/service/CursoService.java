package com.example.sistema.service;

import com.example.sistema.model.Curso;
import com.example.sistema.model.Estudiante;
import com.example.sistema.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public Curso guardarCurso(Curso curso){
        return cursoRepository.save(curso);
    }
    public List<Curso> listarTodos(){
        return cursoRepository.findAll();
    }
    public Optional<Curso> buscarPorId(Long id){
        return cursoRepository.findById(id);
    }
    public void eliminarPorId(Long id) {
        cursoRepository.deleteById(id);
    }
}
