package com.example.demo.modulo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Modulo {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
