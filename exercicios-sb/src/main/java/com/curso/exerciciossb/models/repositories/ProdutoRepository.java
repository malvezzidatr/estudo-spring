package com.curso.exerciciossb.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.curso.exerciciossb.models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {}
