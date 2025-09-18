package com.example.sistema.controller;

import com.example.sistema.model.Pregunta;
import com.example.sistema.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/preguntas")
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;

    // 1. Crear pregunta
    @PostMapping
    public Pregunta crearPregunta(@RequestBody Pregunta pregunta) {
        return preguntaService.guardarPregunta(pregunta);
    }

    // 2. Listar todas las preguntas
    @GetMapping
    public List<Pregunta> listarPreguntas() {
        return preguntaService.listarTodas();
    }

    // 3. Buscar pregunta por ID
    @GetMapping("/{id}")
    public Pregunta obtenerPregunta(@PathVariable Long id) {
        return preguntaService.buscarPorId(id).orElse(null);
    }

    // 4. Eliminar pregunta por ID
    @DeleteMapping("/{id}")
    public void eliminarPregunta(@PathVariable Long id) {
        preguntaService.eliminarPorId(id);
    }
}