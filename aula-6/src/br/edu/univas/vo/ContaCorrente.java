package br.edu.univas.vo;

public class ContaCorrente extends Conta {

	private float taxaManutencao;
	private int chequeEspecial;
	
	public ContaCorrente(int numero, Cliente cliente, float taxaManutencao, int chequeEspecial) {
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

	public float getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(float taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public int getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(int chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
}
