package com.example.sistema.service;

import com.example.sistema.model.Instructor;
import com.example.sistema.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorService {
    @Autowired
    private InstructorRepository instructorRepository;

    public Instructor guardarInstructor (Instructor instructor) {
        return instructorRepository.save(instructor);
    }
    public List<Instructor> listarTodos() {
        return instructorRepository.findAll();
    }
    public Optional <Instructor> buscarPorId(Long id){
        return instructorRepository.findById(id);
    }
    public void eliminarPorId(Long id){
        instructorRepository.deleteById(id);
    }
}
