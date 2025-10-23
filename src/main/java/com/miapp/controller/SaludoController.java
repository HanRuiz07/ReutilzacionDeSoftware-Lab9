package com.miapp.controller;

import org.springframework.web.bind.annotation.*;
import com.miapp.service.SaludoService;

@RestController
@RequestMapping("/api/saludo")
public class SaludoController {

    private final SaludoService saludoService;

    public SaludoController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping("/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return saludoService.obtenerSaludo(nombre);
    }

    @GetMapping
    public String saludarPorDefecto() {
        return saludoService.obtenerSaludo("visitante");
    }
}

