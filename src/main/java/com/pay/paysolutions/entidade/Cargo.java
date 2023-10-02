package com.pay.paysolutions.entidade;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nomeCargo;
    @Column(nullable = false)
    private LocalDate admissao;
    @Column(nullable = false)
    private String descricao;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeCargo() {
        return nomeCargo;
    }
    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }
    public LocalDate getAdmissao() {
        return admissao;
    }
    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
