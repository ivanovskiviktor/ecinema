package com.example.ecinema.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Hall {

    public Hall() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer number;

    @OneToMany
    private List<Row> rows;

    @OneToMany
    private List<MovieSession> movieSessions;

    @ManyToOne
    private Cinema cinema;



}
