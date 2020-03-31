package br.edu.univas.vo;

public class ContaPoupanca extends Conta {

	private float taxaJuros;
	
	public ContaPoupanca(int numero, Cliente cliente, float taxaJuros) {
		super(numero, cliente);
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public boolean sacar(float valorSaque) {
		if (getSaldo() >= valorSaque) {
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
		float juros = getSaldo() * taxaJuros / 100;
		float saldoAtualizado = getSaldo() + juros;
		setSaldo(saldoAtualizado);
	}

	public float getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
}
