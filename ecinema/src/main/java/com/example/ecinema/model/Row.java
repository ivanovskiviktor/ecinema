package com.example.ecinema.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Row {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  int rowNumber;

    private int seats;

    @ManyToOne
    private Hall hall;

}
