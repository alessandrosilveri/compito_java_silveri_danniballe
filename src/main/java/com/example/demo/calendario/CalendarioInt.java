package com.example.demo.calendario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioInt extends JpaRepository<Calendario, Long> {
}
