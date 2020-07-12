package br.edu.univas.vo;

public class Aluno extends User {

	private String matricula;
	private String senha;
	
	@Override
	public String login() {
		return "login:" + matricula + "&password:" + senha;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
