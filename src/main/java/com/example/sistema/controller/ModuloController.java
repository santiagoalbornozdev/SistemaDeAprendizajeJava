package com.example.sistema.controller;

import com.example.sistema.model.Modulo;
import com.example.sistema.service.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modulos")
public class ModuloController {

    @Autowired
    private ModuloService moduloService;

    // 1. Crear módulo
    @PostMapping
    public Modulo crearModulo(@RequestBody Modulo modulo) {
        return moduloService.guardarModulo(modulo);
    }

    // 2. Listar todos los módulos
    @GetMapping
    public List<Modulo> listarModulos() {
        return moduloService.listarTodos();
    }

    // 3. Buscar módulo por ID
    @GetMapping("/{id}")
    public Modulo obtenerModulo(@PathVariable Long id) {
        return moduloService.buscarPorId(id).orElse(null);
    }

    // 4. Eliminar módulo por ID
    @DeleteMapping("/{id}")
    public void eliminarModulo(@PathVariable Long id) {
        moduloService.eliminarPorId(id);
    }
}