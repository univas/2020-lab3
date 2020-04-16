package br.edu.univas.vo;

public class CLT extends Funcionario {

	public CLT(float salarioBase) {
		super(salarioBase);
	}

	@Override
	public float calculaSalario() {
		return getSalarioBase();
	}
	
}
