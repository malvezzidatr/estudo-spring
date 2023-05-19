package com.curso.exerciciossb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso.exerciciossb.models.entities.Produto;
import com.curso.exerciciossb.models.repositories.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public ResponseEntity<Produto> novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return ResponseEntity.status(201).body(produto);
    }

    @GetMapping
    public ResponseEntity<Iterable<Produto>> listarProdutos() {
        return ResponseEntity.status(200).body(produtoRepository.findAll()); 
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Produto>> listarProdutoPorId(@PathVariable int id) {
        return ResponseEntity.status(200).body(produtoRepository.findById(id)); 
    }
}
