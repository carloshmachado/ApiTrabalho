package com.trabalho.api.services;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalho.api.entities.Empresa;
import com.trabalho.api.repositories.EmpresaRepository;

@Service
public class ExemploService {
	
	Empresa empresaCnpj = new Empresa();
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public String testarService() {
		return "ola";
	}
	
	public String login(String cnpj, String razaosocial) {		
		empresaCnpj = empresaRepository.findByCnpjAndRazaoSocial(cnpj, razaosocial);
		try {
			if (empresaCnpj.getCnpj().contains(cnpj)) {
				return empresaCnpj.getRazaoSocial();
			} else {
				return "Empresa não encontrada";
			}	
		} catch(Exception e) {
			return "Empresa não encontrada";
		}
		
	}
}
