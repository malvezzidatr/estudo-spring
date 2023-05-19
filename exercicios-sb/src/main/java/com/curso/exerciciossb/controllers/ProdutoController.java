package com.curso.exerciciossb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.exerciciossb.models.entities.Produto;
import com.curso.exerciciossb.models.repositories.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<Produto> novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return ResponseEntity.status(201).body(produto);
    }
}
