package com.example.ecinema.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Discount {
    public Discount() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Integer percent;

    @OneToMany
    private List<User> users;
}
