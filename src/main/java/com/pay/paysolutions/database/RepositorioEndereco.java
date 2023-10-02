package com.pay.paysolutions.database;

import com.pay.paysolutions.entidade.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEndereco extends JpaRepository<Endereco,Long>{
    
}