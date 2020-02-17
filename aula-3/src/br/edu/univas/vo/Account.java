package br.edu.univas.vo;

public class Account {

	private String customerName;
	
	private String cpf;
	
	private float balance;
	
	public void withdraw(float ammount) {
		if (ammount <= balance) {
			balance -= ammount;
		}
	}
	
	public void deposit(float ammount) {
		balance += ammount;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
}
