package com.example.sistema.controller;

import com.example.sistema.model.Curso;
import com.example.sistema.model.Estudiante;
import com.example.sistema.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    //creo curso
    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso) {
        return cursoService.guardarCurso(curso);
    }
    // Listar todos los cursos
    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarTodos();
    }

    //  Buscar curso por ID
    @GetMapping("/{id}")
    public Curso obtenerCurso(@PathVariable Long id) {
        return cursoService.buscarPorId(id).orElse(null);
    }

    //  Eliminar curso por ID
    @DeleteMapping("/{id}")
    public void eliminarCurso(@PathVariable Long id) {
        cursoService.eliminarPorId(id);
    }


}
