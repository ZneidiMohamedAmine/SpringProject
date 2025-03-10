package com.esprit.firstspringbootproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

    @ManyToOne
    @JoinColumn(name = "universite_id")
    private Universite universite;

    @OneToMany(mappedBy = "foyer")
    private List<Bloc> blocs;

    public void setUniversite(Universite universite) {
    }
}
