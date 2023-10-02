package com.pay.paysolutions.database;

import com.pay.paysolutions.entidade.Banco;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioBanco extends JpaRepository<Banco,Long>{
    
}