package com.example.demo.calendario.calendario_service;

import com.example.demo.calendario.Calendario;

import java.util.List;

public interface CalendrioService {
    Calendario createCalendario(Calendario calendario);
    Calendario updateCalendario(Calendario calendario);
    Void deleteCalendario(Long id);
    List<Calendario> getAllCalendario()
    Calendario getCalendario(Long id);
}
