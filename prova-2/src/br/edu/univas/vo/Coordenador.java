package br.edu.univas.vo;

public class Coordenador extends User {

	private String telefone;
	private String senha;

	@Override
	public String login() {
		return "login:" + telefone + "&password:" + senha;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
