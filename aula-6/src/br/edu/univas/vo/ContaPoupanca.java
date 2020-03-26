package br.edu.univas.vo;

public class ContaPoupanca extends Conta {

	private float taxaJuros;
	
	public ContaPoupanca(int numero, Cliente cliente, float taxaJuros) {
		super(numero, cliente);
	}
	
	@Override
	public boolean sacar(float valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean depositar(float valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean transferenciaEletronica(Conta contaDestina, float valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void atualizarSaldo() {
		// TODO Auto-generated method stub
		
	}

	public float getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
}
