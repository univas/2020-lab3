package br.edu.univas.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculadoraControllerTest {
	
	private CalculadoraController classUnderTest = new CalculadoraController();
	
	//nomeDoMetodo_when_should
	@Test
	public void soma_whenIUsePositiveParameters_shouldReturnAPositiveNumber() {
		int result = classUnderTest.soma(12, 11);
		
		assertEquals(23, result);
		assertEquals(true, result > 0);
	}
	
	@Test
	public void subtracao_whenIUseTwoEqualsParameters_shouldReturnZero() {
		int result = classUnderTest.subtracao(10, 10);
		
		assertEquals(0, result);
	}
	
	@Test
	public void multiplicacao_whenIUse10AsParameter_shouldReturn100() {
		int result = classUnderTest.multiplicacao(10, 10);
		
		assertEquals(100, result);
	}
	
	@Test
	public void divisao_whenIUse100And5_shouldReturn20() {
		int result = classUnderTest.divisao(100, 5);
		
		assertEquals(20, result);
	}
	
	@Test
	public void divisao_whenIUseZeroAsSecondParameter_shouldReturnZero() {
		int result = classUnderTest.divisao(10, 0);
		
		assertEquals(0, result);
	}
}
