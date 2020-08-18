package com.exemplo.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemplo.springboot.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel,Long> {
}
