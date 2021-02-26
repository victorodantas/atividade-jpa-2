package com.example.jpafc.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Campeonato implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private String nome;
    private String dataInicio;
    private String dataFim;
    
    
}
