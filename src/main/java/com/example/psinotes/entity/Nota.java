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
    private String profissionalEmail;
    private String pacienteEmail;
    private String body;
}
