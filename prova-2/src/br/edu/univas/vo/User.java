package br.edu.univas.vo;

public abstract class User implements Login {

	private String nome;
	
	public abstract String login();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
