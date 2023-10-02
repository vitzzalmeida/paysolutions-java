package com.pay.paysolutions;

import java.util.List;

import com.pay.paysolutions.database.RepositorioFuncionario;

import com.pay.paysolutions.entidade.Funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioREST {
    @Autowired
    private RepositorioFuncionario repositorio;

    @GetMapping
    public List<Funcionario> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Funcionario funcionario){
        repositorio.save(funcionario);
    }

    @PutMapping
    public void alterar(@RequestBody Funcionario funcionario){
        if(funcionario.getId() > 0)
            repositorio.save(funcionario);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repositorio.deleteById(id);
    }
}