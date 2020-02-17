package br.edu.univas.main;

import br.edu.univas.vo.Account;

public class StartApp {

	public static void main(String[] args) {
		Account account1 = new Account();
		
		account1.setCustomerName("Rodrigo");
		account1.setCpf("054.157.247-54");
		account1.setBalance(150.99f);
		
		account1.deposit(150);
		account1.withdraw(99);
		account1.withdraw(30);
		account1.deposit(399.99f);
		
		System.out.println("Saldo atual: " + account1.getBalance());
		
		Account account2 = new Account();
		System.out.println("Nome: " + account2.getCustomerName());
		System.out.println("CPF: " + account2.getCpf());
		System.out.println("Saldo atual: " + account2.getBalance());
		
		Account account3 = new Account();
		System.out.println(account3);
		
		Account account4 = null;
		System.out.println(account4);
	}
	
}
