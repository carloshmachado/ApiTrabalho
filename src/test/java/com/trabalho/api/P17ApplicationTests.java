package com.trabalho.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.trabalho.api.services.ExemploService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class P17ApplicationTests {

	@Autowired
	ExemploService serviceTest = new ExemploService();

	@Test
	public void contextLoads() {
	}

	
	@Test
	public void testCarregaContextoDeTeste() {
		assertEquals("ola", serviceTest.testarService());
	}
	
	@Test
	public void testCarregaLoginDoBDExistente() {
		assertEquals("Empresa ADMIN", serviceTest.login("82198127000121", "Empresa ADMIN"));
	}
	
	public void testCarregaLoginDoBDInexistente() {
		assertEquals("Empresa não encontrada", serviceTest.login("82198127000121", "Empresa teste"));
	}
}