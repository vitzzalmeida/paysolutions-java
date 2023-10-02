package com.pay.paysolutions.database;

import com.pay.paysolutions.entidade.Cargo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCargo extends JpaRepository<Cargo,Long>{
    
}