package com.example.SistemaDeAprendizaje.controller;

import com.example.SistemaDeAprendizaje.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.SistemaDeAprendizaje.service.EstudianteService;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    //creo estudiante
    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.guardarEstudiante(estudiante);
    }
    // 2. Listar todos los estudiantes
    @GetMapping
    public List<Estudiante> listarEstudiantes() {
        return estudianteService.listarTodos();
    }

    // 3. Buscar estudiante por ID
    @GetMapping("/{id}")
    public Estudiante obtenerEstudiante(@PathVariable Long id) {
        return estudianteService.buscarPorId(id).orElse(null);
    }

    // 4. Eliminar estudiante por ID
    @DeleteMapping("/{id}")
    public void eliminarEstudiante(@PathVariable Long id) {
        estudianteService.eliminarPorId(id);
    }

}
