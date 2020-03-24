package br.edu.univas.vo;

public abstract class Animal {

	private String raca;
	private float peso;
	
	public abstract String emiteSom();
	
	public void comer() {
		System.out.println("Comendo...");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
}
