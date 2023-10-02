package com.pay.paysolutions;

import java.util.List;

import com.pay.paysolutions.database.RepositorioEndereco;

import com.pay.paysolutions.entidade.Endereco;

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
@RequestMapping("/endereco")
public class EnderecoREST {
    @Autowired
    private RepositorioEndereco repositorio;

    @GetMapping
    public List<Endereco> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Endereco endereco){
        repositorio.save(endereco);
    }

    @PutMapping
    public void alterar(@RequestBody Endereco endereco){
        if(endereco.getId() > 0)
            repositorio.save(endereco);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repositorio.deleteById(id);
    }
}