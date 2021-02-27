package com.example.ecinema.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Seat seat;

    private Integer price;

    @ManyToOne
    private MovieSession movieSession;

    @ManyToOne
    private User user;


}
