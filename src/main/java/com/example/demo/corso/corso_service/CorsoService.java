package com.example.demo.corso.corso_service;

import com.example.demo.corso.Corso;

import java.util.List;

public interface CorsoService {
    Corso createCorso(Corso corso);
    Corso updateCorso(Corso corso);
    Void deleteCorso(Long id);
    List<Corso> getAllCorso()
    Corso getCorso(Long id);
}
