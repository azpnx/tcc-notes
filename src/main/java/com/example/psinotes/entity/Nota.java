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
    private String profissionalEmail;
    @Column(unique = true, length = 60)
    private String pacienteEmail;
    private String body;
}
