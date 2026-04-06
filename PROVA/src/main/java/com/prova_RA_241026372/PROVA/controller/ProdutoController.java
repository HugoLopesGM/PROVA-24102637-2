package com.prova_RA_241026372.PROVA.controller;

import com.prova_RA_241026372.PROVA.model.ProdutoModel;
import com.prova_RA_241026372.PROVA.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @PostMapping
    public ProdutoModel save(@RequestBody ProdutoModel produtoModel){
        return service.save(produtoModel);
    }

    @GetMapping
    public List<ProdutoModel>listarProduto(){
        return service.listarProduto();
    }

    @GetMapping("/{id}")
    public Optional<ProdutoModel>BuscaPorId(@PathVariable Long id){
        return service.BuscaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
