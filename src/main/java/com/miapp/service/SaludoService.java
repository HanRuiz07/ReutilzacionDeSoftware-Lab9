package com.miapp.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String obtenerSaludo(String nombre) {
        return "Hola, " + nombre + "! Bienvenido a la aplicación reutilizable.";
    }
}
