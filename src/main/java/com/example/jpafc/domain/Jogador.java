package com.example.jpafc.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("J")

public class Jogador extends Profissional {

    private String nome;
    private String posicao;
    private String status;

}
