package com.curso.exerciciossb.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.exerciciossb.models.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {}
