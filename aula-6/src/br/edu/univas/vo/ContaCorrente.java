package br.edu.univas.vo;

public class ContaCorrente extends Conta {

	private float taxaManutencao;
	private int chequeEspecial;
	
	public ContaCorrente(int numero, Cliente cliente, float taxaManutencao, int chequeEspecial) {
		super(numero, cliente);
		this.taxaManutencao = taxaManutencao;
		this.chequeEspecial = chequeEspecial;
	}
	
	@Override
	public boolean sacar(float valorSaque) {
		if (getSaldo() + chequeEspecial >= valorSaque) {
			float saldoAtualizado = getSaldo() - valorSaque;
			setSaldo(saldoAtualizado);
			return true;
		}
		return false;
	}

	@Override
	public boolean depositar(float valorDeposito) {
		float saldoAtualizado = getSaldo() + valorDeposito;
		setSaldo(saldoAtualizado);
		return true;
	}

	@Override
	public boolean transferenciaEletronica(Conta contaDestino, float valorTransferencia) {
		if (getSaldo() >= valorTransferencia) {
			float saldoAtualizado = getSaldo() - valorTransferencia;
			setSaldo(saldoAtualizado);
			contaDestino.depositar(valorTransferencia);
			return true;
		}
		return false;
	}

	@Override
	public void atualizarSaldo() {
		float saldoAtualizado = getSaldo() - taxaManutencao;
		setSaldo(saldoAtualizado);
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
