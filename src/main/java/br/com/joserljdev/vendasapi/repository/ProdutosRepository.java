package br.com.joserljdev.vendasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joserljdev.vendasapi.model.Produto;

public interface ProdutosRepository extends JpaRepository<Produto, Long> {

}