package com.example.sistema.controller;

import com.example.sistema.model.Instructor;
import com.example.sistema.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructores")
public class InstructorController {
    @Autowired
    private InstructorService instructorService;

    //creo instructor
    @PostMapping
    public Instructor crearInstructor(@RequestBody Instructor instructor){
        return instructorService.guardarInstructor(instructor);
    }

    //listar instructores
    @GetMapping
    public List<Instructor> listarInstructor(){
        return instructorService.listarTodos();
    }

    // Buscar instructor por ID
    @GetMapping("/{id}")
    public Instructor buscarPorId(@PathVariable Long id) {
        return instructorService.buscarPorId(id).orElse(null);
    }


    //eliminar instructor
    @DeleteMapping("/{id}")
    public void eliminarInstructor(@PathVariable Long id){
        instructorService.eliminarPorId(id);
    }
}
