package com.example.demo.studente.studente_service;

import com.example.demo.studente.Studente;

import java.util.List;

public interface StudenteService {
    Studente createStudente(Studente studente);
    Studente updateStudente(Studente studente);
    Void deleteStudente(Long id);
    List<Studente> getAllStudente()
    Studente getStudente(Long id);
}
