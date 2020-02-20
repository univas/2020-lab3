package br.edu.univas.main;

import br.edu.univas.vo.Account;
import br.edu.univas.vo.Customer;

public class StartApp {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		customer1.setName("Rodrigo");
		customer1.setCpf("054.157.247-54");
		
		Account account1 = new Account();
		account1.setCustomer(customer1);
		account1.setBalance(150.99f);
		
		account1.deposit(150);
		account1.withdraw(99);
		account1.withdraw(30);
		account1.deposit(399.99f);
		
		System.out.println("Nome do cliente: " + account1.getCustomer().getName());
		System.out.println("Saldo atual: " + account1.getBalance());
		
		Account account2 = new Account();
		System.out.println("Saldo atual: " + account2.getBalance());
		
		Account account3 = new Account();
		System.out.println(account3);
		
		Account account4 = null;
		System.out.println(account4);
	}
	
}
