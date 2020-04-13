package br.edu.univas.vo;

public class Animal {

	// final em três casos:
	// pra variavel
	// pra classe
	// pra metodo
	
	private int idade;
	
	public String emiteSom() {
		return "XXXXXXXXX";
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
