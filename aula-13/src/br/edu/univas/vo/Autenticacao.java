package br.edu.univas.vo;

public interface Autenticacao {

	boolean autentica(String email);
	
	default boolean autenticaPorSms(int numeroTelefone) {
		return false;
	}
}
