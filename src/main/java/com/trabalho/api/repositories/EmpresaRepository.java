package com.trabalho.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalho.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	Empresa findByCnpjAndRazaoSocial(String cnpj, String razaoSocial);
	
}