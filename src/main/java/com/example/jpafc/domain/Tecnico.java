package com.example.jpafc.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("T")

public class Tecnico extends Profissional {

    private String nome;

}
