package com.esprit.firstspringbootproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToMany(mappedBy = "universite")
    private List<Foyer> foyers;

    // Getters and Setters
}

