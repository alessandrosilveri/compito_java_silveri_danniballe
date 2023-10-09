package com.example.demo.modulo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuloInt extends JpaRepository<Modulo, Long> {
}
