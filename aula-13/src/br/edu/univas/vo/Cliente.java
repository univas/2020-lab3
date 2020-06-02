package br.edu.univas.vo;

public abstract class Cliente implements Autenticacao {

	private String nome;
	//public String nome2;
	//protected String nome3; 
	//String nome4;
	
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String comprimentar() {
		return "Olá";
	}
	
}
