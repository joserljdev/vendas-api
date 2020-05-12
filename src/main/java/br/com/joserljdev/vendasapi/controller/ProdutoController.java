package br.com.joserljdev.vendasapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joserljdev.vendasapi.model.Produto;
import br.com.joserljdev.vendasapi.repository.ProdutosRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutosRepository produtosRepository;

	@GetMapping
	public List<Produto> listar() {
		return produtosRepository.findAll();
	}
}