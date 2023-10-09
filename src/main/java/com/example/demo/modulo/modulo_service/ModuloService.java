package com.example.demo.modulo.modulo_service;

import com.example.demo.modulo.Modulo;

import java.util.List;

public interface ModuloService {
    Modulo createModulo(Modulo modulo);
    Modulo updateModulo(Modulo modulo);
    Void deleteModulo(Long id);
    List<Modulo> getAllModulo()
    Modulo getModulo(Long id);
}
