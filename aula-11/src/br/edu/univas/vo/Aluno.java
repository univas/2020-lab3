package br.edu.univas.vo;

public class Aluno {

	private String cpf;
	private String nome;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno a = (Aluno) obj;	
		return this.cpf.equals(a.getCpf());
	}
	
	@Override
	public int hashCode() {
		return this.cpf.hashCode();
	}
	
	@Override
	public String toString() {
		return "Meu toString()";
	}
}
