package com.pay.paysolutions;

import java.util.List;

import com.pay.paysolutions.database.RepositorioCargo;

import com.pay.paysolutions.entidade.Cargo;

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
@RequestMapping("/cargo")
public class CargoREST {
    @Autowired
    private RepositorioCargo repositorio;

    @GetMapping
    public List<Cargo> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Cargo cargo){
        repositorio.save(cargo);
    }

    @PutMapping
    public void alterar(@RequestBody Cargo cargo){
        if(cargo.getId() > 0)
            repositorio.save(cargo);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repositorio.deleteById(id);
    }
}