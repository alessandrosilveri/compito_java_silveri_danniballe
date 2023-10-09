package com.example.demo.docente.docente_service;

import com.example.demo.docente.Docente;

import java.util.List;

public interface DocenteService {
    Docente createDocente(Docente docente);
    Docente updateDocente(Docente docente);
    Void deleteDocente(Long id);
    List<Docente> getAllDocente()
    Docente getDocente(Long id);
}
