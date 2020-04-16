package br.edu.univas.vo;

public class Estagiario extends Funcionario {

	private float valorHora;

	public Estagiario(float salarioBase, float valorHora) {
		super(salarioBase);
		this.valorHora = valorHora;
	}
	
	@Override
	public float calculaSalario() {
		return valorHora * getHorasTrabalhadas();
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
}
