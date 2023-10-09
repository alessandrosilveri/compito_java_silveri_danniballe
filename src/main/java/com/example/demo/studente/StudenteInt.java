package com.example.demo.studente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudenteInt extends JpaRepository<Studente, Long>{
}
