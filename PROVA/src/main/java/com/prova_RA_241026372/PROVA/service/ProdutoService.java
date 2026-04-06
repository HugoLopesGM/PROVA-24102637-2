package com.prova_RA_241026372.PROVA.service;

import com.prova_RA_241026372.PROVA.model.ProdutoModel;
import com.prova_RA_241026372.PROVA.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public ProdutoModel save(ProdutoModel produtoModel){
        return repository.save(produtoModel);
    }

    public List<ProdutoModel>listarProduto(){
        return repository.findAll();
    }

    public Optional<ProdutoModel>BuscaPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }


}
