package com.example.demo.corso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorsoInt extends JpaRepository<Corso, Long> {
}
