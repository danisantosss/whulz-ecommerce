package com.whulz.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whulz.ecommerce.entity.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> { 
}