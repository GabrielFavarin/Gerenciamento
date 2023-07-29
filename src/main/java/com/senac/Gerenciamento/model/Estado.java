package com.senac.Gerenciamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estado {

    @Id
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "SIGLA")
    private String sigla;
    @Column(name = "POPULACAO")
    private Double populacao;


    public Estado() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }


}
