package br.edu.univas.view;

public class MenuView {

	public void showMainMenu() {
		System.out.println("\nCONTROLE DE GASTO COM CARTÃO\n");
		System.out.println("1 - Cadastrar usuário");
		System.out.println("2 - Logar");
		System.out.println("3 - Cadastrar Novo Cartão");
		System.out.println("4 - Cadastrar Gasto");
		System.out.println("5 - Listar Gastos");
		System.out.println("9 - Sair");
		System.out.print("\nPor favor, digite sua opção:");
	}
	
	public void showFarewell() {
		System.out.println("\nObrigado por utilizar nosso sistema!");
		System.out.println("Volte sempre!");
	}

	public void showInvalidOption() {
		System.out.println("\nOpção inválida!");
		System.out.println("Por favor, digite uma opção correta!");
	}
	
	public void showUserNotLogged() {
		System.out.println("\nPara essa operação, você precisa estar logado!\n");
	}
}
