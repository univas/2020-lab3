package br.edu.univas.controller;

public class CalculadoraController {

	public int soma(int a, int b) {
		return a + b;
	}
	
	public int subtracao(int a, int b) {
		return a - b;
	}
	
	public int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public int divisao(int a, int b) {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
}
