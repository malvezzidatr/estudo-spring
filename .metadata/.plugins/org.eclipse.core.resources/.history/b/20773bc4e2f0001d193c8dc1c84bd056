package com.curso.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.exerciciossb.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Caio", "49094075881");
	}
}
