package com.example.demo.calendario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Calendario {
    @Id
    @GeneratedValue
    private Long id;
    private Double voti;
    private Boolean prresenze;

}
