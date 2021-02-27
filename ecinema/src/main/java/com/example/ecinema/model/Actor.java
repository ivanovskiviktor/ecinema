package com.example.ecinema.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Actor {

    public Actor() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    @ManyToMany
    private List<Movie> movies;


}
