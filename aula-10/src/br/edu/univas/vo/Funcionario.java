package br.edu.univas.vo;

public abstract class Funcionario {

	private float salarioBase;
	private float horasTrabalhadas;
	
	public Funcionario(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public abstract float calculaSalario();

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	@Override
	public String toString() {
		return "Salário Base: " + salarioBase;
	}
}
