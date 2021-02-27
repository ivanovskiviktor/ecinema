package com.example.ecinema.model;

import com.example.ecinema.model.enums.Genre;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Movie {

    public Movie() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer duration;
    private String description;
    private String year;
    private String country;
    private Integer restriction;
    private LocalDate startFrom;

    @OneToMany
    private List<Actor> actors;

    @Enumerated(EnumType.STRING)
    private Genre genre;
}
