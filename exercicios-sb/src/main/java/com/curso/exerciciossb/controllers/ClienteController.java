package com.curso.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.exerciciossb.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Caio", "49094075881");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Caio Malvezzi", "24843224881");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
		return new Cliente(id, "Caio Vinicius", "49094075881");
	}
	
	@GetMapping("/teste")
	public Cliente obterClientePorId3(int id) {
		return new Cliente(id, "Caio Vinicius", "49094075881");
	}
}
