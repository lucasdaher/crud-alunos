package com.lucasdaher.cadastrodealunos.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "alunos")
public class AlunoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
    private String rg;
}
