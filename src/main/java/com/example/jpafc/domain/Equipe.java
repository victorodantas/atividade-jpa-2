package com.example.jpafc.domain;

import java.io.Serializable;

import javax.persistence.*;

public class Equipe implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    

    
}
