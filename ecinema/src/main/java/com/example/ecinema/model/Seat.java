package com.example.ecinema.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Seat {

    public Seat() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Row row;

    private Integer seat;
}
