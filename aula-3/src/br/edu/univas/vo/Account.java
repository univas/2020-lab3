package br.edu.univas.vo;

public class Account {

	private Customer customer;
	
	private float balance;
	
	public void withdraw(float ammount) {
		if (ammount <= balance) {
			balance -= ammount;
		}
	}
	
	public void deposit(float ammount) {
		balance += ammount;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
