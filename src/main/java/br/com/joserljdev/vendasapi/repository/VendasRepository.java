package br.com.joserljdev.vendasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joserljdev.vendasapi.model.Venda;

public interface VendasRepository extends JpaRepository<Venda, Long> {

}