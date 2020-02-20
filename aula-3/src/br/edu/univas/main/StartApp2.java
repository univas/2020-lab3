package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.Account;
import br.edu.univas.vo.Customer;

public class StartApp2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList contas = new ArrayList();
		
		int option = 0;
		
		do {
			System.out.println(":::Cadastro de Contas:::");
			System.out.println("1 - Cadastrar conta");
			System.out.println("2 - Listar contas");
			System.out.println("9 - Sair");
			
			option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) {
				
				Customer customer = new Customer();
				System.out.println("Digite o nome do cliente: ");
				//String nome = scanner.nextLine();
				//customer.setName(nome);
				customer.setName(scanner.nextLine());
				
				System.out.println("Digite o cpf do cliente: ");
				customer.setCpf(scanner.nextLine());
				
				Account account = new Account();
				account.setCustomer(customer);
				
				System.out.println("Coloque um saldo inicial para essa conta: ");
				account.setBalance(scanner.nextFloat());
				scanner.nextLine();
				
				contas.add(account);
				
				
			} else if (option == 2) {
				
				for (int i = 0; i < contas.size(); i++) {
					Account account = (Account) contas.get(i);
					System.out.println("Nome: " + account.getCustomer().getName());
					System.out.println("CPF: " + account.getCustomer().getCpf());
					System.out.println("Saldo da conta: " + account.getBalance());
				}
				
				
			} else if (option != 9) {
				System.out.println("Digite a opção correta!");
			}
			
			
		} while (option != 9);
	}
}
