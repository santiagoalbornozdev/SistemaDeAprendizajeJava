package com.example.sistema.controller;

import com.example.sistema.model.Estudiante;
import com.example.sistema.model.Evaluacion;
import com.example.sistema.service.EstudianteService;
import com.example.sistema.service.EvaluacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evaluaciones")
public class EvaluacionController {
    @Autowired
    private EvaluacionService evaluacionService;
    @Autowired
    private EstudianteService estudianteService;

    //creo evaluacion
    @PostMapping
    public Evaluacion crearEvaluacion(@RequestBody Evaluacion evaluacion){
        return evaluacionService.guardarEvaluacion(evaluacion);
    }

    //Listar evaluacion por did
    @GetMapping
    public List<Evaluacion> listaEvaluacion(){
        return evaluacionService.ListarTodos();
    }

    //BUSCAR POR ID
    @GetMapping("/{id}")
    public Evaluacion obtenerEvaluacion(@PathVariable Long id){
        return evaluacionService.buscarPorId(id).orElse(null);
    }
    //  Eliminar curso por ID
    @DeleteMapping("/{id}")
    public void eliminarEvaluacion(@PathVariable Long id) {
        evaluacionService.eliminarPorId(id);
    }

    //vincular estudiante - evaluacion
    @PostMapping("/{idEvaluacion}/asignar-estudiante/{idEstudiante}")
    public Evaluacion asignarEstudiante(@PathVariable Long idEvaluacion, @PathVariable Long idEstudiante) {
        Evaluacion evaluacion = evaluacionService.buscarPorId(idEvaluacion).orElseThrow();
        Estudiante estudiante = estudianteService.buscarPorId(idEstudiante).orElseThrow();
        evaluacion.setEstudiante(estudiante);
        return evaluacionService.guardarEvaluacion(evaluacion);
    }
}
