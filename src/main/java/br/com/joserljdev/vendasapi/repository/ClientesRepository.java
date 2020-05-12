package br.com.joserljdev.vendasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joserljdev.vendasapi.model.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente, Long> {

}