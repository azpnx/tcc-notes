package com.example.psinotes.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Nota {

    @JsonProperty("meet_id")
    @Id
    private Long id;
    @Column(unique = true, length = 60)
    private String profissionalEmail;
    @Column(unique = true, length = 60)
    private String pacienteEmail;
    private String body;
}
