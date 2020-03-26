package br.edu.univas.vo;

public abstract class Conta {

	private int numero;
	private float saldo;
	private Cliente cliente;
	
	public Conta(int numero, Cliente cliente) { //constructor!
		
	}
	
	public abstract boolean sacar(float valor);
	
	public abstract boolean depositar(float valor);
	
	public abstract boolean transferenciaEletronica(Conta contaDestina, float valor);
	
	public abstract void atualizarSaldo();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
