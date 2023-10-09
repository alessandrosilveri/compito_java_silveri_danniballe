package com.example.demo.docente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Docente {
    @Id
    @GeneratedValue
    private Long id; //(codice fiscale)
    private String name;
    private String surname;

}
