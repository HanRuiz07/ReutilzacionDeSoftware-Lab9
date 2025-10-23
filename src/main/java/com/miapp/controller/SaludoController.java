package com.miapp.controller;

import org.springframework.web.bind.annotation.*;
import com.miapp.service.SaludoService;

@RestController
@RequestMapping("/api/saludo")
public class SaludoController {

    private final SaludoService saludoService;

    // Inyección de dependencias mediante el constructor
    public SaludoController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    // Endpoint: GET /api/saludo/{nombre}
    @GetMapping("/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return saludoService.obtenerSaludo(nombre);
    }

    // Endpoint: GET /api/saludo
    @GetMapping
    public String saludarPorDefecto() {
        return saludoService.obtenerSaludo("visitante");
    }
}

