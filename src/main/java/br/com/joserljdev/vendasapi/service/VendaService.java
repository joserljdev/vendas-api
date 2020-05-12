package br.com.joserljdev.vendasapi.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joserljdev.vendasapi.model.Venda;
import br.com.joserljdev.vendasapi.repository.ProdutosRepository;
import br.com.joserljdev.vendasapi.repository.VendasRepository;

@Service
public class VendaService {
	
	@Autowired
	private VendasRepository vendasRepository;
	
	@Autowired
	private ProdutosRepository produtosRepository;
	
	public Venda adicionar(Venda venda) {
		venda.setDataHoraVenda(LocalDateTime.now());
		venda.getItens().forEach(i -> {
			i.setVenda(venda);
			i.setProduto(produtosRepository.findById(i.getProduto().getId()).get());
		});
		
		BigDecimal totalItens = venda.getItens().stream()
				.map(i -> i.getProduto().getValor().multiply(new BigDecimal(i.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		venda.setTotal(totalItens.add(venda.getFrete()));
		
		return vendasRepository.save(venda);
	}
}