package com.example.ecinema.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "client")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String firstName;

    private String lastName;

    private String phone;

    private String password;

    private String email;

    @OneToMany
    private List<Ticket> tickets;

    @ManyToOne
    private Discount discount;
}
