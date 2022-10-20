package com.example.psinotes.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true, length = 60)
    private String profissionalId;
    @Column(unique = true, length = 60)
    private String pacienteId;
    private String body;
}
