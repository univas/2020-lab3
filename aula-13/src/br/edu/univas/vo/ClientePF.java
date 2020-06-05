package br.edu.univas.vo;

public class ClientePF extends Cliente {

	private int cpf;
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String comprimentar() {
		return "E aí?";
	}

	@Override
	public boolean autentica(String email) {
		return email.equals(getEmail());
	}
	
	@Override
	public boolean autenticaPorSms(int numeroTelefone) {
		return numeroTelefone < 10;
	}
	
	public int soma(int a, int b) {
		return a + b;
	}
	
}
