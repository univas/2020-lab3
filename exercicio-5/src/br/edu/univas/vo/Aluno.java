package br.edu.univas.vo;

public abstract class Aluno {

	private String nome;
	private int matricula;
	
	public abstract boolean estaAprovado();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
