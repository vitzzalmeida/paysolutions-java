package com.pay.paysolutions.database;

import com.pay.paysolutions.entidade.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioFuncionario extends JpaRepository<Funcionario,Long>{
    
}