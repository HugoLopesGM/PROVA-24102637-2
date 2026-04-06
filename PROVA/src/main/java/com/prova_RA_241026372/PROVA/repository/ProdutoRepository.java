package com.prova_RA_241026372.PROVA.repository;

import com.prova_RA_241026372.PROVA.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
