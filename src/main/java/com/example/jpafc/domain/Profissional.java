package com.example.jpafc.domain;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo")

public class Profissional implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @ManyToOne
    private Equipe equipe;


    
}
