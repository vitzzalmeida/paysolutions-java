package com.pay.paysolutions;

import java.util.List;

import com.pay.paysolutions.database.RepositorioBanco;

import com.pay.paysolutions.entidade.Banco;

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
@RequestMapping("/banco")
public class BancoREST {
    @Autowired
    private RepositorioBanco repositorio;

    @GetMapping
    public List<Banco> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Banco banco){
        repositorio.save(banco);
    }

    @PutMapping
    public void alterar(@RequestBody Banco banco){
        if(banco.getId() > 0)
            repositorio.save(banco);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repositorio.deleteById(id);
    }
}