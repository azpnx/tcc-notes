package com.example.psinotes.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Feedback {
    @Id
    private Long id;
    @Column(unique = true)
    private String professionalId;
    private String body;
}
