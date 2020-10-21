package com.algaworks.osworks2.controllers;

import java.util.List;

import javax.persistence.PersistenceContext;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.algaworks.osworks2.model.Cliente;

@RestController
public class ClienteController {

	@PersistenceContext
	private EntityManager EntityManager;
	
	@GetMapping("/clientes")
	public List<Cliente> get() {
	}
}