package com.example.demo.docente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteInt extends JpaRepository<Docente, Long> {
}
