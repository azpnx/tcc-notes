package com.example.psinotes.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String professionalId;
    private String body;
}
