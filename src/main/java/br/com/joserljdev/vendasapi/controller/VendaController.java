package br.com.joserljdev.vendasapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joserljdev.vendasapi.model.Venda;
import br.com.joserljdev.vendasapi.repository.VendasRepository;
import br.com.joserljdev.vendasapi.service.VendaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/vendas")
public class VendaController {

	@Autowired
	private VendasRepository vendasRepository;

	@Autowired
	private VendaService vendaService;

	@GetMapping
	public List<Venda> listar() {
		return vendasRepository.findAll();
	}

	@PostMapping
	public Venda adicionar(@RequestBody @Valid Venda venda) {
		return vendaService.adicionar(venda);
	}
}