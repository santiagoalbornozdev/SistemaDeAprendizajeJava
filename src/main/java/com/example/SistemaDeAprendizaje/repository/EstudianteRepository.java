package com.example.SistemaDeAprendizaje.repository;

import com.example.SistemaDeAprendizaje.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {}
