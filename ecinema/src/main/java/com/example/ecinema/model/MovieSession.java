package com.example.ecinema.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class MovieSession {


    public MovieSession() {
    }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private LocalDate time;

        @ManyToOne
        private Movie movie;

        @ManyToOne
        private Hall hall;

        @OneToMany
        private List<Ticket> tickets;
    }

