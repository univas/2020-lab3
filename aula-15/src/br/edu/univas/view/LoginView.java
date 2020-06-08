package br.edu.univas.view;

public class LoginView {

	public void showLogin() {
		System.out.println("\nLOGIN\n");
	}
	
	public void showUserName() {
		System.out.print("\nDigite o nome:");
	}
	
	public void showFailLogin() {
		System.out.println("\nNome de usuário inválido!\n");
	}

	public void showSuccessLogin() {
		System.out.println("\nUsuário logado com sucesso!\n");
	}
		
}
