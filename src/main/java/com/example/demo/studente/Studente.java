package com.example.demo.studente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Studente {
    @Id
    @GeneratedValue
    private Long id; //(codice fiscale)
    private String name;
    private String surname;

}
