package com.example.sistema.controller;

import com.example.sistema.model.Evaluacion;
import com.example.sistema.service.EvaluacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evaluaciones")
public class EvaluacionController {
    @Autowired
    private EvaluacionService evaluacionService;

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
}
