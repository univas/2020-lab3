package br.edu.univas.vo;

import java.util.Date;

public class Aluno extends Pessoa {

	private int telefone;
	private Date dataNascimento;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome) {
		super(nome);
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
