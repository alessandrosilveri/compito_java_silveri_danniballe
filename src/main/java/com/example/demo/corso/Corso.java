package com.example.demo.corso;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDate;
@Entity
@Getter
public class Corso {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate orari;

}
