package com.trabalho.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.api.services.ExemploService;

@RestController
@RequestMapping("/api/exemplo")
public class ExemploController {
	
	String login;
	
	@Autowired
	private ExemploService exemploService;
	
	@GetMapping(value = "/{nome}")
	public String exemplo(@PathVariable("nome") String nome) {
		 return exemploService.testarService() + " " + nome;
	}
	
	@GetMapping(value = "/{cnpj}/{razaosocial}")
	public String login(@PathVariable("cnpj") String cnpj, @PathVariable("razaosocial") String razaosocial) {
		 login = exemploService.login(cnpj, razaosocial);
		 if (login.contains(razaosocial)) {
			 return "Bem vindo " + login;  
		 } else {
			 return login;
		 }
	}
}