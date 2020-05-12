package br.com.joserljdev.vendasapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joserljdev.vendasapi.model.Cliente;
import br.com.joserljdev.vendasapi.repository.ClientesRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClientesRepository clienteRepository;

	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
}