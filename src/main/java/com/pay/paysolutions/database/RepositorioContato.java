package com.pay.paysolutions.database;

import com.pay.paysolutions.entidade.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository<Contato,Long>{
    
}