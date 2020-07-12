package br.edu.univas.vo;

public class Professor extends User {

	private String email;
	private String senha;

	@Override
	public String login() {
		return "login:" + email + "&password:" + senha;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
